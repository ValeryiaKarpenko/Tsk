package com.lera.repository;

import java.util.ArrayList;
import java.util.List;

import com.lera.api.repository.IPersonRepository;
import com.lera.model.Person;

public class PersonRepository implements IPersonRepository {
	private static PersonRepository instance;
	private List<Person> listPerson;

	private PersonRepository() {
		listPerson = new ArrayList<Person>();
	}

	public static PersonRepository getInstance() {
		if (instance == null) {
			instance = new PersonRepository();
		}
		return instance;
	}

	public List<Person> getListPerson() {
		return listPerson;
	}

	public void addPerson(Person person) {
		listPerson.add(person);
	}

	public void deletePerson(Person person) {
		listPerson.remove(person);
	}

	public void updatePerson(Person personOld, Person personNew) {
		deletePerson(personOld);
		addPerson(personNew);
	}
	
	public long getPersinId(Person person) {
		return person.getId();
	}
	
	public Person clonePerson(Person person) throws CloneNotSupportedException {
		return person.clone();
	}

}
