package com.lera.model;

public class Book extends Entity {
	private String name;
	private String author;
	private Person reader;

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

	public Person getReader() {
		return reader;
	}

	public void setReader(Person reader) {
		this.reader = reader;
	}

	public String print() {
		StringBuilder sb = new StringBuilder();
		sb.append("name: ").append(this.name).append(" author: ").append(author);
		return sb.toString();
	}

	public String toString() {
		return "Book [name: " + name + ", author: " + author + "]";
	}

}
