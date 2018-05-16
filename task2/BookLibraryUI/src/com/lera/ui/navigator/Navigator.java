package com.lera.ui.navigator;

import java.util.List;

import com.lera.ui.menu.Menu;
import com.lera.ui.menu.MenuItem;
import com.lera.ui.utils.Printer;

public class Navigator {
	private Menu currentMenu;

	public Navigator(Menu currentMenu) {
		this.currentMenu = currentMenu;
	}

	public void printMenu() {
		for (int i = 0; i < currentMenu.getMenuItems().size(); i++) {
			Printer.print(i + "." + currentMenu.getMenuItems().get(i).getTitle());
		}
	}

	public void navigate(Integer index) {
		if (index < currentMenu.getMenuItems().size()) {
			List<MenuItem> menuItemList = currentMenu.getMenuItems();
			MenuItem menuItem = menuItemList.get(index);
			if (menuItem.getAction() != null) {
				menuItem.doAction();
			} else {
				currentMenu = menuItem.getNextMenu();
			}
		} else {
			Printer.print("wrong");
		}
	}
}
