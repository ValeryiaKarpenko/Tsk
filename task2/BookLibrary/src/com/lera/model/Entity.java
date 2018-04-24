package com.lera.model;

public abstract class Entity implements Cloneable {
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
