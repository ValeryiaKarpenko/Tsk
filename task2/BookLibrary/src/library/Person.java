package library;

import java.util.ArrayList;

public class Person {
	protected String fio;
	
	public Person(String fio) {
		this.fio = fio;
	}

	ArrayList<Book> books = new ArrayList<Book>();

	public void setBook(Book book) {
		books.add(book);
	}

	public void deleteBook(Book book) {
		books.remove(book);
	}

	public Book showAllBookPersonHave() {
		Book book = null;
		for (int i = 0; i < books.size(); i++) {
			book = books.get(i);
			System.out.println(books.get(i));
		}
		return book;
	}

}
