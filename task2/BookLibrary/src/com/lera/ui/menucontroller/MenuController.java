package com.lera.ui.menucontroller;

import com.lera.ui.builder.Builder;
import com.lera.ui.navigator.Navigator;
import com.lera.ui.utils.Input;

public class MenuController {
	private Builder builder;
	private Navigator navigator;
	
	public void run() {
		builder = new Builder();
		builder.buildMenu();
		navigator = new Navigator(builder.getRootMenu());
		while (true) {
			navigator.printMenu();
			int position = Input.getInstance().getInt();
			navigator.navigate(position);
		}
	}
}
