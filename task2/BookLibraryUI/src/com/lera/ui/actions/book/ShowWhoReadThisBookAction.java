package com.lera.ui.actions.book;

import java.util.List;

import com.lera.comporator.NameComporator;
import com.lera.model.Book;
import com.lera.ui.actions.Facade;
import com.lera.ui.api.IAction;
import com.lera.ui.utils.Input;
import com.lera.ui.utils.Printer;

public class ShowWhoReadThisBookAction implements IAction {
	private NameComporator nc = null;
	private Input input = Input.getInstance();

	@Override
	public void execute() {
		Printer.print("Choose person");
		List<Book> books = Facade.reflection.getBookList("getBookList", nc);
		for (int i = 0; i < books.size(); i++) {
			Printer.print((i + 1) + "." + books.get(i).toString());
		}
		int numBook = input.getInt();
		Book book = books.get(numBook - 1);
		Facade.reflection.execute("showWhoReadThisBook", book);
	}

}
