package com.lera.service;

import java.util.List;

import com.lera.model.Book;
import com.lera.model.Person;
import com.lera.repository.BookRepository;

public class BookService {
	private BookRepository bookRepository;

	public BookService() {
		bookRepository = BookRepository.getInstance();
	}

	public void addBook(Book book) {
		bookRepository.addBook(book);
	}

	public void deleteBook(Book book) {
		bookRepository.deleteBook(book);
	}

	public List<Book> getBookList() {
		return bookRepository.getBookList();
	}

	public Person whoReadThisBook(Book book) {
		return book.getReader();
	}
	
}
