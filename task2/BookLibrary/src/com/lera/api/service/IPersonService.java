package com.lera.api.service;

import java.util.List;

import com.lera.model.Book;
import com.lera.model.Person;

public interface IPersonService {
	public void addPerson(Person person);

	public void deletePerson(Person person);

	public List<Person> getListPerson();

	public void addBookToPerson(Person person, Book book);
}
