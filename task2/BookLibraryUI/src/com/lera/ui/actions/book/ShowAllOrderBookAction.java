package com.lera.ui.actions.book;

import com.lera.comporator.NameComporator;
import com.lera.ui.actions.Facade;
import com.lera.ui.api.IAction;

public class ShowAllOrderBookAction implements IAction {
	@Override
	public void execute() {
		Facade.reflection.execute("showAllBook", new NameComporator());
	}
}
