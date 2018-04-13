package com.lera.interfaces;

import com.lera.library.Book;
import com.lera.library.Person;

public interface IBookManager extends IManager {

	public void addBook(Book book);

	public Person whoRead(Book Book);

}
