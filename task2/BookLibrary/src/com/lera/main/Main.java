package com.lera.main;

import com.lera.controler.Controller;
import com.lera.model.Book;
import com.lera.model.Person;

public class Main {
	public static void main(String[] args) {
		Controller controller = new Controller();
		Book book = createBook("Harry Potter", "Joan");
		Book book1 = createBook("Pride and prejudice", "Ostin");
		Book book2 = createBook("Game of Thrones", "Martin");
		Person person1 = createPerson("lera");
		Person person2 = createPerson("lera2");

		controller.addBook(book);
		controller.addBook(book1);
		controller.addBook(book2);
		controller.showAllBook();

		controller.addPerson(person1);
		controller.addPerson(person2);
		controller.showAllPerson();

		controller.addBookToPerson(person1, book1);
		controller.addBookToPerson(person1, book);
		controller.showAllPersonBook(person1);

		controller.showWhoReadThisBook(book1);

		controller.showAllBookAndWhoRead();
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
