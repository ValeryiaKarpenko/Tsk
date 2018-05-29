package com.lera.ui.actions;

import com.lera.ui.api.IAction;

public class ShowAllBookAndWhoReadAction implements IAction {

	@Override
	public void execute() {
		Facade.reflection.execute("showAllBookAndWhoRead");
	}
}
