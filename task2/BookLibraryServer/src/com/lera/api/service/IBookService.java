package com.lera.api.service;

import java.util.Comparator;
import java.util.List;

import com.lera.comporator.NameComporator;
import com.lera.model.Book;
import com.lera.model.Person;

public interface IBookService {
	public void addBook(String name, String author);

	public void deleteBook(Book book);

	public List<Book> getBookList(Comparator<Book> comporator);
	
	public Person getBookReaders(Book book);
	
	public Book cloneBook(Book book) throws CloneNotSupportedException;
	
	public void showAllBook(NameComporator nameComporator);
	
	public void showWhoReadThisBook(Book book);
	
	public void showAllBookAndWhoRead();
	
	public void writeBookInFile(String filePath);
	
	public List<Book> readBookFromFile(String filePath);
}
