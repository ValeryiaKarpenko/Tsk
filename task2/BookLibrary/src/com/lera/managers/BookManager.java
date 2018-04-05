package com.lera.managers;

import com.lera.library.Book;
import com.lera.library.Person;

public class BookManager extends Manager {

	public void addBook(Book book) {
		Book[] books = lib.getBooks();
		if (!arrayHelper.checkArray(books)) {
			arrayHelper.incrementArray(books);
		} else {
			Integer index = arrayHelper.getNullIndex(books);
			books[index] = book;
		}
	}

	public Person whereTheBook(Book book) {
		Person p = book.getWhereTheBook();
		return p;
	}

	public void showAllBookAndWhoRead() {
		Book[] books = lib.getBooks();
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				Person p = books[i].getWhereTheBook();
				System.out.println("book " + books[i] + " who read " + p);
			}
		}
	}
}
