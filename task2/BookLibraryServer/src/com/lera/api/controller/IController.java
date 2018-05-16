package com.lera.api.controller;

import java.util.Comparator;
import java.util.List;

import com.lera.comporator.NameComporator;
import com.lera.model.Book;
import com.lera.model.Person;

public interface IController {
	public void addBook(Book book);

	public void addPerson(Person person);

	public void addBookToPerson(Person person, Book book);
	
	public List<Book> getBookList(Comparator<Book> comporator);
	
	public List<Person> getPersonList(Comparator<Person> comporator);

	public void showAllBook(NameComporator nameComporator);

	public void showAllPerson();

	public void showAllPersonBook(Person person);

	public void showWhoReadThisBook(Book book);

	public void showAllBookAndWhoRead();
	
	public Book cloneBook(Book book);
	
	public Person clonePerson(Person person);
	
	public void writeBookInFile(String filePath);
	
	public void writePersonInFile(String filePath);
	
	public List<Book> readBookFromFile(String filePath);
	
	public void readPersonFromFile(String filePath);
	
	public void serializeInFile(String filePathBookRepository, String filePathPersonRepository);
	

}
