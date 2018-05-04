package com.lera.utils;

import java.util.List;

import com.lera.model.Book;
import com.lera.model.Person;

public class CsvObject {

	public static String getListBookObject(List<Book> books) {
		StringBuffer sb = new StringBuffer();
		for (Book book : books) {
			sb.append(book.getId()).append(";").append(book.getName()).append(";").append(book.getAuthor())
					.append("\n");
		}
		return sb.toString();
	}

	public static String getListPersonObject(List<Person> persons) {
		StringBuffer sb = new StringBuffer();
		for (Person person : persons) {
			sb.append(person.getId()).append(";").append(person.getFio()).append("\n");
		}
		return sb.toString();
	}

}
