package com.lera.ui.actions.person;

import java.util.List;

import com.lera.api.controller.IController;
import com.lera.controller.Controller;
import com.lera.model.Book;
import com.lera.model.Person;
import com.lera.ui.api.IAction;
import com.lera.ui.utils.Input;
import com.lera.utils.Printer;

public class AddBookToPersonAction implements IAction{

	@Override
	public void execute() {
		Input input = Input.getInstance();
		IController controller = Controller.getInstance();
		
		Printer.print("Choose person");
		List<Person> persons = controller.getPersonList(null);
		int numPerson = input.getInt();
		
		Printer.print("Choose book");
		List<Book> books = controller.getBookList(null);
		int numBook = input.getInt();
		
	}

}
