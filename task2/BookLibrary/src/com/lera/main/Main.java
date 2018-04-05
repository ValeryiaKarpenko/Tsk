package com.lera.main;

import com.lera.library.Book;
import com.lera.library.Person;
import com.lera.managers.BookManager;
import com.lera.managers.Manager;
import com.lera.managers.PersonManager;

public class Main extends Manager {
	public static void main(String[] args) {
		PersonManager pm = new PersonManager();
		BookManager bm = new BookManager();

		Person p = new Person("d");
		Person p1 = new Person("d");
		Person p3 = new Person("d");
		Book book1 = new Book("h", "f");
		Book book2 = new Book("h", "f");
		Book book3 = new Book("h", "f");

		pm.addPerson(p);
		pm.addPerson(p1);
		pm.addPerson(p3);
		bm.addBook(book1);
		bm.addBook(book2);
		bm.addBook(book3);
		pm.addBookToPerson(book1, p);
		pm.addBookToPerson(book2, p);
		pm.addBookToPerson(book3, p);
		pm.showAllPersons();
		System.out.println();
		pm.showAllBooksPersonHas(p);
		bm.whereTheBook(book1);
		pm.delBookToPerson(book1, p);
		System.out.println();
		pm.showAllBooksPersonHas(p);
		bm.showAllBookAndWhoRead();

	}

}
