package com.lera.library;

public class Book extends Entity {
	private String name;
	private String author;
	private Person person;

	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String print() {
		StringBuilder sb = new StringBuilder();
		sb.append("name: ").append(this.name).append(" author: ").append(author);
		return sb.toString();
	}

}
