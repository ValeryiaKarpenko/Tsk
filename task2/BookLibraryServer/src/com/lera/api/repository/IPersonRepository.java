package com.lera.api.repository;

import java.util.List;

import com.lera.model.Person;

public interface IPersonRepository {
	public List<Person> getListPerson();

	public void addPerson(String name);

	public void deletePerson(Person person);

	public void updatePerson(Person personNew);
	
	public String getPersonById(int id);
	
	public Person clonePerson(Person person) throws CloneNotSupportedException;

}
