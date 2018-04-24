package com.lera.controler;

import java.util.List;

import com.lera.api.controller.IController;
import com.lera.api.service.IBookService;
import com.lera.api.service.IPersonService;
import com.lera.comporator.NameComporator;
import com.lera.model.Book;
import com.lera.model.Person;
import com.lera.service.BookService;
import com.lera.service.PersonService;
import com.lera.utils.Printer;

public class Controller implements IController {
	private static Controller instance;
	private IBookService bookService;
	private IPersonService personService;

	private Controller() {
		bookService = new BookService();
		personService = new PersonService();
	}

	public static Controller getInstance() {
		if (instance == null) {
			instance = new Controller();
		}
		return instance;
	}

	public void addBook(Book book) {
		bookService.addBook(book);
	}

	public void addPerson(Person person) {
		personService.addPerson(person);
	}

	public void addBookToPerson(Person person, Book book) {
		personService.addBookToPerson(person, book);
	}

	public void showAllBook() {
		Printer.printArray(bookService.getBookList(new NameComporator()));
	}

	public void showAllPerson() {
		Printer.printArray(personService.getListPerson());
	}

	public void showAllPersonBook(Person person) {
		Printer.printArray(person.getPersonBookList());
	}

	public void showWhoReadThisBook(Book book) {
		Printer.print(book.getReader());
	}

	public Book cloneBook(Book book) throws CloneNotSupportedException {
		return bookService.cloneBook(book);
	}

	public Person clonePerson(Person person) throws CloneNotSupportedException {
		return personService.clonePerson(person);
	}

	public void showAllBookAndWhoRead() {
		List<Book> listBook = bookService.getBookList(null);
		for (int i = 0; i < listBook.size(); i++) {
			Printer.print(listBook.get(i));
			if (listBook.get(i).getReader() == null) {
				Printer.print("book is free");
			} else {
				Printer.print(listBook.get(i).getReader());
			}
		}
	}

}
