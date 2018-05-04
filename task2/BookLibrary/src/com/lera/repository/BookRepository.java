package com.lera.repository;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.lera.api.repository.IBookRepository;
import com.lera.controller.Constant;
import com.lera.model.Book;
import com.lera.utils.Printer;
import com.lera.utils.Serializer;

public class BookRepository extends MainRepository implements IBookRepository, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static IBookRepository instance;
	private List<Book> bookList;

	private BookRepository() {
		bookList = new ArrayList<Book>();
	}

	public static IBookRepository getInstance() {
		if (instance == null) {
			
			try {
				instance =  (IBookRepository) Serializer.desirialize("BookRepository");
			} catch (ClassNotFoundException e) {
				Printer.print(Constant.CLASS_NOT_FOUND);
			}catch (FileNotFoundException e) {
				instance = new BookRepository();
			}
			catch (IOException e) {
				Printer.print(Constant.SOME_OTHER_EXCEPTION);
			}
		}		
		return instance;
	}

	public List<Book> getBookList(Comparator<Book> comporator) {
		if (comporator == null) {
			Collections.sort(bookList);
		} else {
			Collections.sort(bookList, comporator);
		}
		return bookList;
	}

	public void addBook(Book book) {
		bookList.add(book);
	}

	public void deleteBook(Book book) {
		bookList.remove(book);
	}

	public void updateBook(Book bookOld, Book bookNew) {
		deleteBook(bookOld);
		addBook(bookNew);
	}

	public long getBookId(Book book) {
		return book.getId();
	}

	public Book cloneBook(Book book) throws CloneNotSupportedException {
		return book.clone();
	}

}
