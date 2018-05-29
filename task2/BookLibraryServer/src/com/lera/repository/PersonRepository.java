package com.lera.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.lera.api.repository.IPersonRepository;
import com.lera.model.Person;
import com.lera.utils.Serializer;

public class PersonRepository extends MainRepository implements IPersonRepository, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static IPersonRepository instance;
	private List<Person> listPerson;

	private PersonRepository() {
		listPerson = new ArrayList<Person>();
	}

	public static IPersonRepository getInstance() {
		if (instance == null) {
			instance = (IPersonRepository) Serializer.desirialize("PersonRepository");
			if (instance == null) {
				instance = new PersonRepository();
			}
		}
		return instance;
	}

	public List<Person> getListPerson() {
		Collections.sort(listPerson);
		return listPerson;
	}

	public void addPerson(String name) {
		Person person = new Person(name);
		listPerson.add(person);
	}

	public void deletePerson(Person person) {
		listPerson.remove(person);
	}

	public void updatePerson(Person personNew) {
		for (Person person : listPerson) {
			if (person.getId() == personNew.getId()) {
				person.setFio(personNew.getFio());
			}
		}
	}

	public String getPersonById(int id) {
		for (Person person : listPerson) {
			if (person.getId() == id) {
				return person.toString();
			}
		}
		return null;
	}

	public Person clonePerson(Person person) throws CloneNotSupportedException {
		return person.clone();
	}

}
