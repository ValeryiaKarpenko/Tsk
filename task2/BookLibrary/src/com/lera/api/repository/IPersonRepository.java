package com.lera.api.repository;

import java.util.List;

import com.lera.model.Person;

public interface IPersonRepository {
	public List<Person> getListPerson();

	public void addPerson(Person person);

	public void deletePerson(Person person);

	public void updatePerson(Person personOld, Person personNew);
	
	public long getPersinId(Person person);
	
	public Person clonePerson(Person person) throws CloneNotSupportedException;

}
