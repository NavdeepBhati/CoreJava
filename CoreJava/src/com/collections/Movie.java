package com.collections;

import java.util.HashMap;

class Movie {
	private String name, actor;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public int getReleaseYr() {
		return releaseYr;
	}

	public void setReleaseYr(int releaseYr) {
		this.releaseYr = releaseYr;
	}

	private int releaseYr;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actor == null) ? 0 : actor.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + releaseYr;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		if (actor == null) {
			if (other.actor != null)
					return false;
		} else if (!actor.equals(other.actor))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (releaseYr != other.releaseYr)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", actor=" + actor + ", releaseYr=" + releaseYr + "]";
	}
}