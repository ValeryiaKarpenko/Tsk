package com.lera.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import com.lera.comporator.NameComporator;
import com.lera.model.Book;
import com.lera.model.Person;
import com.lera.reflection.api.IReflection;

public class Reflection implements IReflection {
	private static IReflection instance;
	private static Class<?> c = null;
	private static Object object = null;

	private Reflection() {
	}

	public static IReflection getInstance() {
		if (instance == null) {
			instance = new Reflection();
			try {
				c = Class.forName("com.lera.controller.Controller");
				object = c.newInstance();
			} catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
				e.printStackTrace();
			}
		}
		return instance;
	}

	public void execute(String methName) {
		try {
			Method method = c.getDeclaredMethod(methName);
			method.invoke(object);
		} catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
			e.printStackTrace();
		}

	}

	public void execute(String methName, String str) {
		try {
			Class<?> param[] = new Class[] { String.class };
			Method method = c.getDeclaredMethod(methName, param);
			Object[] args = new Object[] { new String(str) };
			method.invoke(object, args);
		} catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public void execute(String methName, String str1, String str2) {
		try {
			Class<?> param[] = new Class[] { String.class, String.class };
			Method method = c.getDeclaredMethod(methName, param);
			Object[] args = new Object[] { new String(str1), new String(str2) };
			method.invoke(object, args);
		} catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public void execute(String methName, NameComporator nc) {
		try {
			Class<?> param[] = new Class[] { NameComporator.class };
			Method method = c.getDeclaredMethod(methName, param);
			Object[] args = new Object[] { nc };
			method.invoke(object, args);
		} catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public void execute(String methName, Person person) {
		try {
			Class<?> param[] = new Class[] { Person.class };
			Method method = c.getDeclaredMethod(methName, param);
			Object[] args = new Object[] { person };
			method.invoke(object, args);
		} catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public void execute(String methName, Book book) {
		try {
			Class<?> param[] = new Class[] { Book.class };
			Method method = c.getDeclaredMethod(methName, param);
			Object[] args = new Object[] { book };
			method.invoke(object, args);
		} catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public void execute(String methName, Person person, Book book) {
		try {
			Class<?> param[] = new Class[] { Person.class, Book.class };
			Method method = c.getDeclaredMethod(methName, param);
			Object[] args = new Object[] { person, book };
			method.invoke(object, args);
		} catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public List<Person> getPersonList(String methName) {
		List<Person> persons = null;
		try {
			Method method = c.getDeclaredMethod(methName);
			persons = (List<Person>) method.invoke(object);
		} catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return persons;
	}

	public List<Book> getBookList(String methName, NameComporator comporator) {
		List<Book> books = null;
		try {
			Class<?> param[] = new Class[] { NameComporator.class };
			Method method = c.getDeclaredMethod(methName, param);
			Object[] args = new Object[] { comporator };
			books = (List<Book>) method.invoke(object, args);
		} catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return books;
	}

}
