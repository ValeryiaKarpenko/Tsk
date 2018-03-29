package main;

import library.Book;
import library.Library;
import library.Person;

public class Main {
	public static void main(String[] args) {
		Library lib = new Library();
		Person person1 = new Person("bob");
		Person person2 = new Person("pit");
		Book book1 = new Book("Harry Potter","Joan Rowling");
		Book book2 = new Book("Pride","Jane Austen");
		
		lib.setReader(person1);
		lib.setReader(person2);
		lib.showAllReaders();
		lib.setBook(book1);
		lib.setBook(book2);
		person1.setBook(book1);
		person1.setBook(book2);
		person1.showAllBookPersonHave();
		person1.deleteBook(book2);
		person1.showAllBookPersonHave();
		book1.setReader(person1);
		book1.showWhoGetBook();
		
	}
	
}
