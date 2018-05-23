package com.multithreading;

class MyHouse  implements Runnable{
    private boolean pizzaArrived = false;

    public void eatPizza() {
        synchronized(this){
            while(!pizzaArrived){
                try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        }
        System.out.println("yumyum..");
    }

    public void pizzaGuy(){
        synchronized(this){
             this.pizzaArrived = true;
             notifyAll();
        }
    }


    @Override
    public void run() {
    	int i=100;
    	while (i>0) {

        	eatPizza();  
        	pizzaGuy();	
		i--;
    	}
    }
    
public static void main(String[] args) {
	
	MyHouse mh = new MyHouse();
	
	Thread t0 = new Thread(mh);
	t0.start();
	
	
}


}
