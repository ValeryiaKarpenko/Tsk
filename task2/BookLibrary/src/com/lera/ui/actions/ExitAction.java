package com.lera.ui.actions;

import com.lera.api.controller.IController;
import com.lera.controller.Controller;
import com.lera.ui.api.IAction;

public class ExitAction implements IAction{

	@Override
	public void execute() {
		IController controller = Controller.getInstance();
		controller.serializeInFile("book", "person");
		System.exit(0);
	}
	
}
