package com.lera.ui.actions.person;

import com.lera.api.controller.IController;
import com.lera.controller.Controller;
import com.lera.ui.api.IAction;
import com.lera.ui.utils.Input;
import com.lera.utils.Printer;

public class ReadPersonsFromCsvAction implements IAction{

	@Override
	public void execute() {
		Input input = Input.getInstance();
		IController controller = Controller.getInstance();
		
		Printer.print("Write path");
		String filePath = input.getString();
		controller.readPersonFromFile(filePath);
		
	}

}