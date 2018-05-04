package com.lera.service;

import java.util.Comparator;
import java.util.List;

import com.lera.api.repository.IBookRepository;
import com.lera.api.service.IBookService;
import com.lera.model.Book;
import com.lera.model.Person;
import com.lera.repository.BookRepository;

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
}
