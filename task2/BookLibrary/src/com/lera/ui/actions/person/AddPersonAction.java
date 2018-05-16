package com.lera.ui.actions.person;

import com.lera.api.controller.IController;
import com.lera.controller.Controller;
import com.lera.main.Main;
import com.lera.model.Person;
import com.lera.ui.api.IAction;
import com.lera.ui.utils.Input;
import com.lera.utils.Printer;

public class AddPersonAction implements IAction{

	@Override
	public void execute() {
		Input input = Input.getInstance();
		IController controller = Controller.getInstance();
		Printer.print("fio");
		String fio = input.getString();
		
		Person person = Main.createPerson(fio);
		controller.addPerson(person);
		
	}

}
