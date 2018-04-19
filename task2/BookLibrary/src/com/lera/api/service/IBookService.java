package com.lera.api.service;

import java.util.List;

import com.lera.model.Book;
import com.lera.model.Person;

public interface IBookService {
	public void addBook(Book book);

	public void deleteBook(Book book);

	public List<Book> getBookList();
	
	public Person whoReadThisBook(Book book);
}
