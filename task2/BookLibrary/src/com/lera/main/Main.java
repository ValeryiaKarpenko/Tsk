package com.lera.main;

import com.lera.library.Book;
import com.lera.library.Person;
import com.lera.manager.BookManager;
import com.lera.manager.PersonManager;

public class Main {
	public static void main(String[] args) {
		BookManager bm = new BookManager();
		PersonManager pm = new PersonManager();

		Book book = new Book("f", "f");
		Book book2 = new Book("i", "i");
		Person person = new Person("Ron");
		Person person2 = new Person("Harry");

		System.out.println("--books--");
		bm.addBook(book);
		bm.addBook(book2);
		bm.showAllBook();
		System.out.println("--persons--");
		pm.addPerson(person);
		pm.addPerson(person2);
		pm.showAllPerson();
		System.out.println("--book to person--");
		pm.addBookToPerson(person, book);
		pm.addBookToPerson(person, book2);
		pm.showAllBookPersonHas(person);

	}

}
