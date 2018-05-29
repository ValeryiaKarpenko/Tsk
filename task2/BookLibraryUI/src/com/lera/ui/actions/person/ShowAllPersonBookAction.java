package com.lera.ui.actions.person;

import java.util.List;

import com.lera.model.Person;
import com.lera.ui.actions.Facade;
import com.lera.ui.api.IAction;
import com.lera.ui.utils.Input;
import com.lera.ui.utils.Printer;

public class ShowAllPersonBookAction implements IAction {
	private Input input = Input.getInstance();

	@Override
	public void execute() {
		Printer.print("Choose person");
		List<Person> persons = Facade.reflection.getPersonList("getPersonList");
		for (int i = 0; i < persons.size(); i++) {
			Printer.print((i + 1) + "." + persons.get(i).toString());
		}
		int numPerson = input.getInt();
		Person person = persons.get(numPerson - 1);
		Facade.reflection.execute("showAllPersonBook", person);

	}

}
