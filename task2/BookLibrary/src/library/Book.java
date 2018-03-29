package library;

import java.util.ArrayList;

public class Book {
	public String name;
	public String author;

	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}

	ArrayList<Person> readers = new ArrayList<Person>();

	public void setReader(Person reader) {
		if (readers.size() < 1) {
			readers.add(reader);
		}
	}

	public Person showWhoGetBook() {
		Person person = null;
		for (int i = 0; i < readers.size(); i++) {
			person = readers.get(i);
			System.out.println(readers.get(i));
		}
		return person;
	}
}
