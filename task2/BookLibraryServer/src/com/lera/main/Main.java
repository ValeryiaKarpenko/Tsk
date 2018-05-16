package com.lera.main;

import com.lera.model.Book;
import com.lera.model.Person;

public class Main {
	public static void main(String[] args) {

	}

	public static Book createBook(String name, String author) {
		Book book = new Book(name, author);
		return book;
	}

	public static Person createPerson(String name) {
		Person person = new Person(name);
		return person;
	}

}
