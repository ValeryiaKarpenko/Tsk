package com.lera.ui.actions.person;

import com.lera.api.controller.IController;
import com.lera.controller.Controller;
import com.lera.ui.api.IAction;

public class ShowAllPersonAction implements IAction{

	@Override
	public void execute() {
		IController controller = Controller.getInstance();
		controller.showAllPerson();
		
	}

}
