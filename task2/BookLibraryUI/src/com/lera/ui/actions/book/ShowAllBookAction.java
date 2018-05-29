package com.lera.ui.actions.book;

import com.lera.comporator.NameComporator;
import com.lera.ui.actions.Facade;
import com.lera.ui.api.IAction;

public class ShowAllBookAction implements IAction {
	private NameComporator nc = null;

	@Override
	public void execute() {
		Facade.reflection.execute("showAllBook", nc);
	}
}
