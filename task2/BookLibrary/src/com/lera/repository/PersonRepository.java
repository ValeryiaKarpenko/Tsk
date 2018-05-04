package com.lera.repository;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.lera.api.repository.IPersonRepository;
import com.lera.controller.Constant;
import com.lera.model.Person;
import com.lera.utils.Printer;
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
			try {
				instance = (IPersonRepository) Serializer.desirialize("PersonRepository");
			} catch (ClassNotFoundException e) {
				Printer.print(Constant.CLASS_NOT_FOUND);
			}catch (FileNotFoundException e) {
				instance = new PersonRepository();
			}
			catch (IOException e) {
				Printer.print(Constant.SOME_OTHER_EXCEPTION);
			}
		}
		return instance;
	}

	public List<Person> getListPerson() {
		Collections.sort(listPerson);
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
