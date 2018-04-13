package com.lera.interfaces;

import com.lera.library.Book;
import com.lera.library.Person;

public interface IPersonManager extends IManager {

	public void addPerson(Person person);

	public void addBookToPerson(Person person, Book book);

}
