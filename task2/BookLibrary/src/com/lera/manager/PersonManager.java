package com.lera.manager;

import java.util.List;

import com.lera.interfaces.IPersonManager;
import com.lera.library.Book;
import com.lera.library.Person;

public class PersonManager extends Manager implements IPersonManager {

	List<Person> list = lib.getPersons();

	@Override
	public void addPerson(Person person) {
		list.add(person);
		lib.setPersons(list);
	}

	@Override
	public void addBookToPerson(Person person, Book book) {
		List<Book> listBook = person.getPersonBooks();
		listBook.add(book);
		book.setPerson(person);
	}

	public void showAllPerson() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).print());
		}
	}

	public void showAllBookPersonHas(Person person) {
		List<Book> listBook = person.getPersonBooks();
		for (int i = 0; i < listBook.size(); i++) {
			System.out.println(person.print() + " has book " + listBook.get(i).print());
		}
	}

}
