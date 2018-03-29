package library;

import java.util.ArrayList;

public class Library {
	ArrayList<Book> books = new ArrayList<Book>();
	ArrayList<Person> readers = new ArrayList<Person>();

	public void setBook(Book book) {
		books.add(book);
	}

	public void setReader(Person reader) {
		readers.add(reader);
	}

	public Person showAllReaders() {
		Person person = null;
		for (int i = 0; i < readers.size(); i++) {
			person = readers.get(i);
			System.out.println(readers.get(i));
		}
		return person;
	}
}
