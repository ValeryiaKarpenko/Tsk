package com.lera.ui.actions.book;

import com.lera.ui.actions.Facade;
import com.lera.ui.api.IAction;
import com.lera.ui.utils.Input;
import com.lera.ui.utils.Printer;

public class AddBookAction implements IAction{
	private Input input = Input.getInstance();

	@Override
	public void execute() {		
		Printer.print("name");
		String name = input.getString();
		
		Printer.print("author");
		String author = input.getString();

		Facade.reflection.execute("addBook", name, author);
	}

}