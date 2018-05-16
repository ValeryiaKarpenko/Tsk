package com.lera.service;

import java.util.List;

import com.lera.api.repository.IPersonRepository;
import com.lera.api.service.IPersonService;
import com.lera.model.Book;
import com.lera.model.Person;
import com.lera.repository.PersonRepository;
import com.lera.utils.CsvWorker;
import com.lera.utils.Printer;

public class PersonService implements IPersonService{
	private IPersonRepository personRepository;

	public PersonService() {
		personRepository = PersonRepository.getInstance();
	}

	public void addPerson(Person person) {
		personRepository.addPerson(person);
	}

	public void deletePerson(Person person) {
		personRepository.deletePerson(person);
	}

	public List<Person> getListPerson() {
		return personRepository.getListPerson();
	}

	public void addBookToPerson(Person person, Book book) {
		List<Book> listPersonBook = person.getPersonBookList();
		listPersonBook.add(book);
		book.setReader(person);
		person.setPersonBookList(listPersonBook);
	}
	
	public Person clonePerson(Person person) throws CloneNotSupportedException {
		return personRepository.clonePerson(person);
	}
	
	public void showAllPerson() {
		Printer.printArray(personRepository.getListPerson());
	}

	public void showAllPersonBook(Person person) {
		Printer.printArray(person.getPersonBookList());
	}
	
	public void writePersonInFile(String filePath) {
		 CsvWorker.write(personRepository.getListPerson(), filePath);
	}
	
	public void readPersonFromFile(String filePath) {
		CsvWorker.read(filePath);
	}


}
