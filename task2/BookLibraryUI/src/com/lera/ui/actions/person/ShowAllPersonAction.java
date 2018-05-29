package com.lera.ui.actions.person;

import com.lera.ui.actions.Facade;
import com.lera.ui.api.IAction;

public class ShowAllPersonAction implements IAction {
	
	@Override
	public void execute() {
		Facade.reflection.execute("showAllPerson");
	}
}
