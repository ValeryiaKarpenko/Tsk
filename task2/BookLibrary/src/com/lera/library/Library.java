package com.lera.library;

public class Library extends Entity {
	private Person[] persons = new Person[10];
	private Book[] books = new Book[10];

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	public Person[] getPersons() {
		return persons;
	}

	public void setPersons(Person[] persons) {
		this.persons = persons;
	}

}
