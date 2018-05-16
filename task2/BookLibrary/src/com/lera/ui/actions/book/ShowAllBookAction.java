package com.lera.ui.actions.book;

import com.lera.api.controller.IController;
import com.lera.controller.Controller;
import com.lera.ui.api.IAction;

public class ShowAllBookAction implements IAction{

	@Override
	public void execute() {
		IController controller = Controller.getInstance();
		controller.showAllBook(null);		
	}

}
