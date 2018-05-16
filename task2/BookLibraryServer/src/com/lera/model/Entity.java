package com.lera.model;

public abstract class Entity implements Cloneable {
	protected int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
