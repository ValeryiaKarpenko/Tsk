package com.lera.ui.actions.book;

import com.lera.ui.actions.Facade;
import com.lera.ui.api.IAction;
import com.lera.ui.utils.Input;
import com.lera.ui.utils.Printer;

public class WriteBookToCsvAction implements IAction{
	private Input input = Input.getInstance();
	
	@Override
	public void execute() {		
		Printer.print("Write path");
		String filePath = input.getString();
		Facade.reflection.execute("writeBookInFile", filePath);
	}
}
