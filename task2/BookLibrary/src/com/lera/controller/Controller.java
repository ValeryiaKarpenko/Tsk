package com.lera.controller;

import java.io.IOException;
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
import com.lera.utils.CsvObject;
import com.lera.utils.CsvWorker;

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

	public void addBook(Book book) {
		bookService.addBook(book);
	}

	public void addPerson(Person person) {
		personService.addPerson(person);
	}

	public void addBookToPerson(Person person, Book book) {
		try {
			personService.addBookToPerson(person, book);
		} catch (ArrayStoreException e) {
			Printer.print(Constant.WRONG_TYPE);
			log.info(Constant.WRONG_TYPE);
		} catch (Exception e) {
			Printer.print(Constant.SOME_OTHER_EXCEPTION);
			log.info(Constant.SOME_OTHER_EXCEPTION);
		}
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
		try {
			Printer.print(book.getReader());
		} catch (Exception e) {
			Printer.print(Constant.SOME_OTHER_EXCEPTION);
			log.info(Constant.SOME_OTHER_EXCEPTION);
		}
	}

	public Book cloneBook(Book book) {
		Book newBook = null;
		try {
			newBook = bookService.cloneBook(book);
		} catch (CloneNotSupportedException e) {
			System.out.println(Constant.OBJECT_CANT_CLONE);
			log.info(Constant.OBJECT_CANT_CLONE);
		} catch (Exception e) {
			System.out.println(Constant.SOME_OTHER_EXCEPTION);
			log.info(Constant.SOME_OTHER_EXCEPTION);
		}
		return newBook;
	}

	public Person clonePerson(Person person) {
		Person newPerson = null;
		try {
			newPerson = personService.clonePerson(person);
		} catch (CloneNotSupportedException e) {
			Printer.print(Constant.OBJECT_CANT_CLONE);
			log.info(Constant.OBJECT_CANT_CLONE);
		} catch (Exception e) {
			Printer.print(Constant.SOME_OTHER_EXCEPTION);
			log.info(Constant.SOME_OTHER_EXCEPTION);
		}
		return newPerson;
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

	public void writeBookInFile(String filePath) {
		String booksString = CsvObject.getListBookObject(bookService.getBookList(null));
			CsvWorker.write(booksString, filePath);
	}

	public void writePersonInFile(String filePath) {
		String personsString = CsvObject.getListPersonObject(personService.getListPerson());
			CsvWorker.write(personsString, filePath);
	}

	public void readBookFromFile(String filePath) {
			CsvWorker.read(filePath);
	}

	public void readPersonFromFile(String filePath) {
			CsvWorker.read(filePath);

	}

	public void serializeInFile(String filePathBookRepository, String filePathPersonRepository) {
			try {
				Serializer.serialize((MainRepository) BookRepository.getInstance(), filePathBookRepository);
				Serializer.serialize((MainRepository) PersonRepository.getInstance(), filePathPersonRepository);
			} catch (IOException e) {
				Printer.print(Constant.SOME_OTHER_EXCEPTION);
				log.info(Constant.SOME_OTHER_EXCEPTION);
			}
	}

}
