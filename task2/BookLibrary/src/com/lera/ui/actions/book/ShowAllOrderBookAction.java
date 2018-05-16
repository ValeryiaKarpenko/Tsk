package com.lera.ui.actions.book;

import com.lera.api.controller.IController;
import com.lera.comporator.NameComporator;
import com.lera.controller.Controller;
import com.lera.ui.api.IAction;

public class ShowAllOrderBookAction implements IAction{
	@Override
	public void execute() {
		IController controller = Controller.getInstance();
		controller.showAllBook(new NameComporator());		
	}
}
