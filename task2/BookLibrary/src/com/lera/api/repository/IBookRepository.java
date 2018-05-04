package com.lera.api.repository;

import java.util.Comparator;
import java.util.List;

import com.lera.model.Book;

public interface IBookRepository {
	public List<Book> getBookList(Comparator<Book> nameComporator);

	public void addBook(Book book);

	public void deleteBook(Book book);
	
	public void updateBook(Book bookOld, Book bookNew);
	
	public long getBookId(Book book);
	
	public Book cloneBook(Book book) throws CloneNotSupportedException;

}
