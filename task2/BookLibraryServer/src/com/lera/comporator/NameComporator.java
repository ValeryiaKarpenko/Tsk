package com.lera.comporator;

import java.util.Comparator;

import com.lera.model.Book;

public class NameComporator implements Comparator<Book> {
	public int compare(Book book1, Book book2) {

		if (book1 != null && book2 != null) {
			int flag = book1.getName().compareTo(book2.getName());

			if (flag == 0) {
				flag = book1.getAuthor().compareTo(book2.getAuthor());
			}
			return flag;
		} else if(book1 != null && book2 ==null) {
			return 1;
		}
		return -1;

	}
}
