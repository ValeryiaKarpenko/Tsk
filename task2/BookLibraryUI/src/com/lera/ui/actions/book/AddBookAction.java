package com.lera.ui.actions.book;

import com.lera.api.controller.IController;
import com.lera.controller.Controller;
import com.lera.main.Main;
import com.lera.model.Book;
import com.lera.ui.api.IAction;
import com.lera.ui.utils.Input;
import com.lera.ui.utils.Printer;

public class AddBookAction implements IAction{

	@Override
	public void execute() {		
		Input input = Input.getInstance();
		IController controller = Controller.getInstance();
		Printer.print("name");
		String name = input.getString();
		
		Printer.print("author");
		String author = input.getString();
		
		Book book = Main.createBook(name, author);
		controller.addBook(book);
	}

}