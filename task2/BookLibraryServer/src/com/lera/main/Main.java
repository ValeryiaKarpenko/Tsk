package com.lera.main;

import com.lera.model.Book;

public class Main {
	public static void main(String[] args) {

	}
	
	public static Book createBook(String name, String author) {
		Book book = new Book(name,author);
		return book;
	}

}
