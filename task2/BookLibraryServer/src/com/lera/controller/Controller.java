package com.lera.controller;

import java.util.List;
import java.util.logging.Logger;

import com.lera.api.controller.IController;
import com.lera.api.service.IBookService;
import com.lera.api.service.IPersonService;
import com.lera.comporator.NameComporator;
import com.lera.model.Book;
import com.lera.model.Person;
import com.lera.repository.BookRepository;
import com.lera.repository.MainRepository;
import com.lera.repository.PersonRepository;
import com.lera.service.BookService;
import com.lera.service.PersonService;
import com.lera.utils.Printer;
import com.lera.utils.Serializer;

public class Controller implements IController {
	private static Controller instance;
	private IBookService bookService;
	private IPersonService personService;

	private static final Logger log = Logger.getLogger(Controller.class.getName());

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

	public void addBook(String name, String author) {
		bookService.addBook(name, author);
	}

	public void addPerson(String name) {
		personService.addPerson(name);
	}

	public void addBookToPerson(Person person, Book book) {
		try {
			personService.addBookToPerson(person, book);
		} catch (ArrayStoreException e) {
			log.info(Constant.WRONG_TYPE);
			Printer.print(Constant.WRONG_TYPE);
		} catch (Exception e) {
			log.info(Constant.SOME_OTHER_EXCEPTION);
			Printer.print(Constant.SOME_OTHER_EXCEPTION);
		}
	}

	public List<Book> getBookList(NameComporator comporator) {
		return bookService.getBookList(comporator);
	}

	public List<Person> getPersonList() {
		return personService.getListPerson();
	}

	public void showAllBook(NameComporator nameComporator) {
		bookService.showAllBook(nameComporator);
	}

	public void showAllPerson() {
		personService.showAllPerson();
	}

	public void showAllPersonBook(Person person) {
		personService.showAllPersonBook(person);
	}

	public void showWhoReadThisBook(Book book) {
		try {
			bookService.showWhoReadThisBook(book);
		} catch (Exception e) {
			log.info(Constant.SOME_OTHER_EXCEPTION);
			Printer.print(Constant.SOME_OTHER_EXCEPTION);
		}
	}

	public Book cloneBook(Book book) {
		Book newBook = null;
		try {
			newBook = bookService.cloneBook(book);
		} catch (CloneNotSupportedException e) {
			log.info(Constant.OBJECT_CANT_CLONE);
			Printer.print(Constant.OBJECT_CANT_CLONE);
		} catch (Exception e) {
			log.info(Constant.SOME_OTHER_EXCEPTION);
			Printer.print(Constant.SOME_OTHER_EXCEPTION);
		}
		return newBook;
	}

	public Person clonePerson(Person person) {
		Person newPerson = null;
		try {
			newPerson = personService.clonePerson(person);
		} catch (CloneNotSupportedException e) {
			log.info(Constant.OBJECT_CANT_CLONE);
			Printer.print(Constant.OBJECT_CANT_CLONE);
		} catch (Exception e) {
			log.info(Constant.SOME_OTHER_EXCEPTION);
			Printer.print(Constant.SOME_OTHER_EXCEPTION);
		}
		return newPerson;
	}

	public void showAllBookAndWhoRead() {
		bookService.showAllBookAndWhoRead();
	}

	public void writeBookInFile(String filePath) {
		bookService.writeBookInFile(filePath);
	}

	public void writePersonInFile(String filePath) {
		personService.writePersonInFile(filePath);
	}

	public List<Book> readBookFromFile(String filePath) {
		return bookService.readBookFromFile(filePath);
	}

	public void readPersonFromFile(String filePath) {
		personService.readPersonFromFile(filePath);
	}

	public void serializeInFile(String filePathBookRepository, String filePathPersonRepository) {
		Serializer.serialize((MainRepository) BookRepository.getInstance(), filePathBookRepository);
		Serializer.serialize((MainRepository) PersonRepository.getInstance(), filePathPersonRepository);
	}

}
