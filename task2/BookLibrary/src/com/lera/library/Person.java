package com.lera.library;

import java.util.ArrayList;
import java.util.List;

public class Person extends Entity {
	private String name;
	private List<Book> personBooks = new ArrayList<Book>();

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getPersonBooks() {
		return personBooks;
	}

	public void setPersonBooks(List<Book> personBooks) {
		this.personBooks = personBooks;
	}

	public String print() {
		StringBuilder sb = new StringBuilder();
		sb.append("name: ").append(this.name);
		return sb.toString();
	}

}
