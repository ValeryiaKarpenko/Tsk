package com.lera.repository;

import java.util.ArrayList;
import java.util.List;

import com.lera.api.repository.IBookRepository;
import com.lera.model.Book;

public class BookRepository implements IBookRepository {
	private static BookRepository instance;
	private List<Book> bookList;

	private BookRepository() {
		bookList = new ArrayList<Book>();
	}

	public static BookRepository getInstance() {
		if (instance == null) {
			instance = new BookRepository();
		}
		return instance;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void addBook(Book book) {
		bookList.add(book);
	}

	public void deleteBook(Book book) {
		bookList.remove(book);
	}
}
