package com.lera.service;

import java.util.List;

import com.lera.model.Book;
import com.lera.model.Person;
import com.lera.repository.PersonRepository;

public class PersonService {
	private PersonRepository personRepository;

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
}
