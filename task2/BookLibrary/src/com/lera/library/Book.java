package com.lera.library;

public class Book extends Entity {
	private String name;
	private String author;
	public Person whereTheBook;

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

	public Person getWhereTheBook() {
		return whereTheBook;
	}

	public void setWhereTheBook(Person whereTheBook) {
		this.whereTheBook = whereTheBook;
	}
}
