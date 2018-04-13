package com.lera.library;

import java.util.ArrayList;
import java.util.List;

public class Library extends Entity {
	private List<Book> books = new ArrayList<Book>();
	private List<Person> persons = new ArrayList<Person>();

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	public List<Person> getPersons() {
		return persons;
	}

}
