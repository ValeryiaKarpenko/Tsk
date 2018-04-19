package com.lera.controler;

import java.util.List;

import com.lera.model.Book;
import com.lera.model.Person;
import com.lera.service.BookService;
import com.lera.service.PersonService;
import com.lera.utils.Printer;

public class Controller {

	private BookService bookService;
	private PersonService personService;

	public Controller() {
		bookService = new BookService();
		personService = new PersonService();
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
		Printer.printArray(bookService.getBookList());
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

	public void showAllBookAndWhoRead() {
		List<Book> listBook = bookService.getBookList();
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
