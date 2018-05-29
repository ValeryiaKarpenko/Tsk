package com.lera.api.repository;

import java.util.Comparator;
import java.util.List;

import com.lera.model.Book;

public interface IBookRepository {
	public List<Book> getBookList(Comparator<Book> nameComporator);

	public void addBook(String name, String author);

	public void deleteBook(Book book);
	
	public void updateBook(Book bookNew);
	
	public String getBookById(int id);
	
	public Book cloneBook(Book book) throws CloneNotSupportedException;

}
