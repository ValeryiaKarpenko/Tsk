package com.lera.comporator;

import java.util.Comparator;

import com.lera.model.Book;

public class NameComporator implements Comparator<Book> {
	public int compare(Book o1, Book o2) {

		int flag = o1.getName().compareTo(o2.getName());

		if (flag == 0) {
			flag = o1.getAuthor().compareTo(o2.getAuthor());
		}
		return flag;

	}
}
