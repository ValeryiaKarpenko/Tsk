package com.lera.manager;

import java.util.List;

import com.lera.interfaces.IBookManager;
import com.lera.library.Book;
import com.lera.library.Person;

public class BookManager extends Manager implements IBookManager {

	List<Book> list = lib.getBooks();

	@Override
	public void addBook(Book book) {
		list.add(book);
		lib.setBooks(list);
	}

	@Override
	public Person whoRead(Book book) {
		Person whoRead = book.getPerson();
		return whoRead;
	}

	public void showAllBook() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).print());
		}
	}

}
