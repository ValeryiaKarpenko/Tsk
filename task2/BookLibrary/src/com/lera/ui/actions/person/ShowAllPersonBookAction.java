package com.lera.ui.actions.person;

import java.util.List;

import com.lera.api.controller.IController;
import com.lera.controller.Controller;
import com.lera.model.Person;
import com.lera.ui.api.IAction;
import com.lera.ui.utils.Input;
import com.lera.utils.Printer;

public class ShowAllPersonBookAction implements IAction{

	@Override
	public void execute() {
		Input input = Input.getInstance();
		IController controller = Controller.getInstance();
		
		Printer.print("Choose person");
		List<Person> persons = controller.getPersonList(null);
		for (int i = 0; i < persons.size(); i++) {
			Printer.print(i + "." + persons.get(i).toString());
		}
		int numPerson = input.getInt();
		
		controller.showAllPersonBook(persons.get(numPerson));
		
	}

}
