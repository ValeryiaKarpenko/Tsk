package com.lera.api.repository;

import java.util.List;

import com.lera.model.Book;

public interface IBookRepository {
	public List<Book> getBookList();

	public void addBook(Book book);

	public void deleteBook(Book book);

}
