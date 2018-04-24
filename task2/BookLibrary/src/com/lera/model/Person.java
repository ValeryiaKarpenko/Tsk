package com.lera.model;

import java.util.ArrayList;
import java.util.List;

public class Person extends Entity {
	private String fio;
	private static long ID;
	private List<Book> personBookList;

	public Person(String fio) {
		setId(ID++);
		this.fio = fio;
		personBookList = new ArrayList<Book>();
	}

	public String getFio() {
		return fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public List<Book> getPersonBookList() {
		return personBookList;
	}

	public void setPersonBookList(List<Book> personBookList) {
		this.personBookList = personBookList;
	}

	public String toString() {
		return "Person [id: " + getId() + " name: " + fio + " ] ";
	}

	public Person clone() throws CloneNotSupportedException {
		return (Person) super.clone();
	}

}
