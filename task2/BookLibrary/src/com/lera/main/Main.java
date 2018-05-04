package com.lera.main;

import com.lera.api.controller.IController;
import com.lera.controller.Controller;
import com.lera.model.Book;
import com.lera.model.Person;

public class Main {
	public static void main(String[] args) {
		IController controller = Controller.getInstance();
		Book book = createBook("Harry Potter", "Joan");
		Book book1 = createBook("Pride and prejudice", "Ostin");
		Book book2 = createBook("Game of Thrones", "Martin");
		Person person1 = createPerson("lera1");
		Person person2 = createPerson("lera2");
		Person person = null;
		controller.addBook(book);
		controller.addBook(book1);
		controller.addBook(book2);
		controller.showAllBook();

		controller.addPerson(person1);
		controller.addPerson(person2);
		controller.showAllPerson();

		controller.addBookToPerson(person, book1);
		controller.addBookToPerson(person1, book);
		// controller.showAllPersonBook(person1);

		controller.showWhoReadThisBook(book1);

		controller.showAllBookAndWhoRead();

		System.out.println("------------");
		Book bookClone2;
		Book book0 = null;
		bookClone2 = controller.cloneBook(book1);
		bookClone2.setName("Kk");
		controller.addBook(bookClone2);

		Book book16 = createBook("Pride and prejudice", "Oa");
		controller.addBook(book16);

		Book book17 = createBook("Pa", "Ostin");
		controller.addBook(book17);

		controller.showAllBook();

		Person personClone;
		personClone = controller.clonePerson(person1);
		personClone.setFio("lera");
		controller.addPerson(personClone);
		controller.showAllPerson();

		controller.writeBookInFile("books.csv");
		controller.writePersonInFile("persons.csv");

		controller.readBookFromFile("bookms.csv");
		controller.readPersonFromFile("persons.csv");

		controller.serializeInFile("BookRepository", "PerosonRepository");
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
