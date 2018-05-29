package com.lera.api.service;

import java.util.List;

import com.lera.model.Book;
import com.lera.model.Person;

public interface IPersonService {
	public void addPerson(String name);

	public void deletePerson(Person person);

	public List<Person> getListPerson();

	public void addBookToPerson(Person person, Book book);
	
	public Person clonePerson(Person person) throws CloneNotSupportedException;
	
	public void showAllPerson();
	
	public void showAllPersonBook(Person person);
	
	public void writePersonInFile(String filePath);
	
	public void readPersonFromFile(String filePath);
}
