package com.lera.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.lera.api.repository.IBookRepository;
import com.lera.model.Book;
import com.lera.utils.Serializer;

public class BookRepository extends MainRepository implements IBookRepository, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static IBookRepository instance;
	private List<Book> bookList;

	private BookRepository() {
		bookList = new ArrayList<Book>();
	}

	public static IBookRepository getInstance() {
		if (instance == null) {
			instance = (IBookRepository) Serializer.desirialize("BookRepository");
			if (instance == null) {
				instance = new BookRepository();
			}
		}
		return instance;

	}

	public List<Book> getBookList(Comparator<Book> comporator) {
		if (comporator == null) {
			Collections.sort(bookList);
		} else {
			Collections.sort(bookList, comporator);
		}
		return bookList;
	}

	public void addBook(Book book) {
		bookList.add(book);
	}

	public void deleteBook(Book book) {
		bookList.remove(book);
	}

	public void updateBook(Book bookNew) {
		for (Book book : bookList) {
			if (book.getId() == bookNew.getId()) {
				book.setName(bookNew.getName());
				book.setAuthor(bookNew.getAuthor());
			}
		}
	}

	public String getBookById(int id) {
		for (Book book : bookList) {
			if (book.getId() == id) {
				return book.toString();
			}
		}
		return null;
	}

	public Book cloneBook(Book book) throws CloneNotSupportedException {
		return book.clone();
	}

}
