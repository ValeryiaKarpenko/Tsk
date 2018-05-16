package com.lera.service;

import java.util.Comparator;
import java.util.List;

import com.lera.api.repository.IBookRepository;
import com.lera.api.service.IBookService;
import com.lera.comporator.NameComporator;
import com.lera.model.Book;
import com.lera.model.Person;
import com.lera.repository.BookRepository;
import com.lera.utils.CsvWorker;
import com.lera.utils.Printer;

public class BookService implements IBookService {
	private IBookRepository bookRepository;

	public BookService() {
		bookRepository = BookRepository.getInstance();
	}

	public void addBook(Book book) {
		bookRepository.addBook(book);
	}

	public void deleteBook(Book book) {
		bookRepository.deleteBook(book);
	}

	public List<Book> getBookList(Comparator<Book> comporator) {
		return bookRepository.getBookList(comporator);
	}

	public Person getBookReaders(Book book) {
		return book.getReader();
	}
	
	public Book cloneBook(Book book) throws CloneNotSupportedException {
		return bookRepository.cloneBook(book);
		
	}
	
	public void showAllBook(NameComporator nameComporator) {
		Printer.printArray(bookRepository.getBookList(nameComporator));
	}
	
	public void showWhoReadThisBook(Book book) {
			Printer.print(book.getReader());
	}
	
	public void showAllBookAndWhoRead() {
		List<Book> listBook = bookRepository.getBookList(null);
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
		 CsvWorker.write(bookRepository.getBookList(null), filePath);
	}
	
	public List<Book> readBookFromFile(String filePath) {
		return CsvWorker.read(filePath);
	}
	
}
