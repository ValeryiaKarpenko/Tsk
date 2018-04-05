package com.lera.managers;

import com.lera.library.Book;
import com.lera.library.Person;

public class PersonManager extends Manager {

	public boolean isPersonAdded(Person pers) {
		Person[] persons = lib.getPersons();
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] == pers) {
				return true;
			}
		}
		return false;
	}

	public boolean isBookAdded(Book book) {
		Book[] books = lib.getBooks();
		for (int i = 0; i < books.length; i++) {
			if (books[i] == book) {
				return true;
			}
		}
		return false;
	}

	public void addPerson(Person person) {
		Person[] persons = lib.getPersons();
		if (!arrayHelper.checkArray(persons)) {
			arrayHelper.incrementArray(persons);
		} else {
			Integer index = arrayHelper.getNullIndex(persons);
			persons[index] = person;
		}
	}

	public void showAllPersons() {
		Person[] persons = lib.getPersons();
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] != null) {
				System.out.println(persons[i]);
			}
		}
	}

	public void addBookToPerson(Book book, Person p) {
		if (isPersonAdded(p) && isBookAdded(book)) {
			Book[] books = p.getBooks();
			if (!arrayHelper.checkArray(books)) {
				arrayHelper.incrementArray(books);
			} else {
				Integer index = arrayHelper.getNullIndex(books);
				books[index] = book;
			}
			book.whereTheBook = p;
			p.setBooks(books);
		}
	}

	public void delBookToPerson(Book book, Person p) {
		Book[] books = p.getBooks();
		Integer index = arrayHelper.getIndexObject(books, book);
		arrayHelper.deleteElementIfKnowIndex(books, index);
		p.setBooks(books);
	}

	public void showAllBooksPersonHas(Person p) {
		Book[] books = p.getBooks();
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				System.out.println(books[i]);
			}
		}
	}

}
