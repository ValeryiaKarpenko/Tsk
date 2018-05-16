package com.lera.ui.builder;

import java.util.ArrayList;
import java.util.List;

import com.lera.ui.actions.ExitAction;
import com.lera.ui.actions.book.AddBookAction;
import com.lera.ui.actions.book.ShowAllBookAction;
import com.lera.ui.actions.book.ShowAllOrderBookAction;
import com.lera.ui.actions.person.AddPersonAction;
import com.lera.ui.actions.person.ShowAllPersonAction;
import com.lera.ui.menu.Menu;
import com.lera.ui.menu.MenuItem;

public class Builder {
	private Menu rootMenu;

	private Menu bookMenu(Menu back) {
		Menu bookMenu = new Menu();
		List<MenuItem> menuItemBook = new ArrayList<>();

		MenuItem prevMenu = new MenuItem();
		prevMenu.setTitle("Go back to current menu");
		prevMenu.setNextMenu(back);
		menuItemBook.add(prevMenu);

		MenuItem addBookItem = new MenuItem();
		addBookItem.setTitle("add book");
		addBookItem.setAction(new AddBookAction());
		menuItemBook.add(addBookItem);

		MenuItem showBookItem = new MenuItem();
		showBookItem.setTitle("show all book");
		showBookItem.setNextMenu(bookMenuOrder(rootMenu));
		menuItemBook.add(showBookItem);
		bookMenu.setMenuItems(menuItemBook);
		return bookMenu;
	}

	private Menu bookMenuOrder(Menu back) {
		Menu bookMenuOrder = new Menu();
		List<MenuItem> menuItemOrderBook = new ArrayList<>();

		MenuItem prevMenu = new MenuItem();
		prevMenu.setTitle("Go back to current menu");
		prevMenu.setNextMenu(back);
		menuItemOrderBook.add(prevMenu);

		MenuItem showAllBookItem = new MenuItem();
		showAllBookItem.setTitle("show all book without order");
		showAllBookItem.setAction(new ShowAllBookAction());
		menuItemOrderBook.add(showAllBookItem);

		MenuItem showAllOrderBookItem = new MenuItem();
		showAllOrderBookItem.setTitle("show all book with order");
		showAllOrderBookItem.setAction(new ShowAllOrderBookAction());
		menuItemOrderBook.add(showAllOrderBookItem);

		bookMenuOrder.setMenuItems(menuItemOrderBook);
		return bookMenuOrder;
	}
	
	private Menu personMenu(Menu back) {
		Menu bookMenu = new Menu();
		List<MenuItem> menuItemPerson = new ArrayList<>();

		MenuItem prevMenu = new MenuItem();
		prevMenu.setTitle("Go back to current menu");
		prevMenu.setNextMenu(back);
		menuItemPerson.add(prevMenu);

		MenuItem addPersonItem = new MenuItem();
		addPersonItem.setTitle("add person");
		addPersonItem.setAction(new AddPersonAction());
		menuItemPerson.add(addPersonItem);

		MenuItem showPersonItem = new MenuItem();
		showPersonItem.setTitle("show all person");
		showPersonItem.setAction(new ShowAllPersonAction());
		menuItemPerson.add(showPersonItem);
		bookMenu.setMenuItems(menuItemPerson);
		return bookMenu;
	}

	public void buildMenu() {
		rootMenu = new Menu();
		rootMenu.setName("Library menu");
		List<MenuItem> list = new ArrayList<>();

		MenuItem exitMenu = new MenuItem();
		exitMenu.setTitle("Exit");
		exitMenu.setAction(new ExitAction());
		list.add(exitMenu);

		MenuItem bookMenu = new MenuItem();
		bookMenu.setTitle("Books");
		bookMenu.setNextMenu(bookMenu(rootMenu));
		list.add(bookMenu);
		
		MenuItem personMenu = new MenuItem();
		personMenu.setTitle("Persons");
		personMenu.setNextMenu(personMenu(rootMenu));
		list.add(personMenu);

		rootMenu.setMenuItems(list);
	}

	public Menu getRootMenu() {
		return rootMenu;
	}
}