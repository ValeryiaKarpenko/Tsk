package com.lera.ui.actions;

import com.lera.ui.api.IAction;

public class ExitAction implements IAction{

	@Override
	public void execute() {
		Facade.reflection.execute("serializeInFile", "book", "person");
		System.exit(0);
	}
}
