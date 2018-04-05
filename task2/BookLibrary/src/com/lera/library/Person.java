package com.lera.library;

public class Person extends Entity {
	private String fio;

	public Person(String fio) {
		this.fio = fio;
	}

	Book[] books = new Book[10];

	public String getFio() {
		return fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}
}
