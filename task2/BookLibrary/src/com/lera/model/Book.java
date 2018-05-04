package com.lera.model;

import java.io.Serializable;

public class Book extends Entity implements Comparable<Book>,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7343011118007827061L;
	private String name;
	private String author;
	private Person reader;
	private static int ID;

	public Book(String name, String author) {
		setId(ID++);
		this.name = name;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Person getReader() {
		return reader;
	}

	public void setReader(Person reader) {
		this.reader = reader;
	}

	public String toString() {
		return "Book [id: " + getId() + " name: " + name + ", author: " + author + "]";
	}

	public Book clone() throws CloneNotSupportedException {
		return (Book) super.clone();
	}

	@Override
	public int compareTo(Book book) {
		if (book != null) {
		return this.name.compareTo(book.getName());
		}
		return 0;
	}


}
