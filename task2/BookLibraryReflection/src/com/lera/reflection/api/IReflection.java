package com.lera.reflection.api;

import java.util.List;

import com.lera.comporator.NameComporator;
import com.lera.model.Book;
import com.lera.model.Person;

public interface IReflection {
	public void execute(String methName);

	public void execute(String methName, String str);

	public void execute(String methName, String str1, String str2);

	public void execute(String methName, NameComporator nc);

	public void execute(String methName, Person person);

	public void execute(String methName, Book book);

	public void execute(String methName, Person person, Book book);

	public List<Person> getPersonList(String methName);

	public List<Book> getBookList(String methName, NameComporator comporator);
}
