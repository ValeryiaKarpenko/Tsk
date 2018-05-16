package com.lera.ui.actions.book;

import java.util.List;

import com.lera.api.controller.IController;
import com.lera.controller.Controller;
import com.lera.model.Book;
import com.lera.ui.api.IAction;
import com.lera.ui.utils.Input;
import com.lera.utils.Printer;

public class ShowWhoReadThisBookAction implements IAction{

	@Override
	public void execute() {
		Input input = Input.getInstance();
		IController controller = Controller.getInstance();
		
		Printer.print("Choose person");
		List<Book> books = controller.getBookList(null);
		for (int i = 0; i < books.size(); i++) {
			Printer.print(i + "." + books.get(i).toString());
		}
		int numBook = input.getInt();
		
		controller.showWhoReadThisBook(books.get(numBook));
		
	}

}
