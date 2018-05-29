package com.lera.ui.actions.person;

import com.lera.ui.actions.Facade;
import com.lera.ui.api.IAction;
import com.lera.ui.utils.Input;
import com.lera.ui.utils.Printer;

public class AddPersonAction implements IAction {
	private Input input = Input.getInstance();

	@Override
	public void execute() {
		Printer.print("fio");
		String fio = input.getString();

		Facade.reflection.execute("addPerson", fio);

	}

}
