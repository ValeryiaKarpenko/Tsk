package com.lera.api.controller;

import com.lera.model.Book;
import com.lera.model.Person;

public interface IController {
	public void addBook(Book book);

	public void addPerson(Person person);

	public void addBookToPerson(Person person, Book book);

	public void showAllBook();

	public void showAllPerson();

	public void showAllPersonBook(Person person);

	public void showWhoReadThisBook(Book book);

	public void showAllBookAndWhoRead();
	
	public Book cloneBook(Book book) throws CloneNotSupportedException;
	
	public Person clonePerson(Person person) throws CloneNotSupportedException;

}
