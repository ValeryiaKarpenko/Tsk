package com.lera.ui.utils;

import java.io.InputStream;
import java.util.Scanner;

public class Input {
	private static Input instance;
	private Scanner scanner;
	private final String NOT_NUMBER = "its not number";

	private Input(InputStream inputStream) {
		this.scanner = new Scanner(inputStream);
	}

	public static Input getInstance() {
		if (instance == null) {
			instance = new Input(System.in);
		}
		return instance;
	}

	public int getInt() {
		int index = 0;
		boolean flag = false;
		while (!flag) {
			try {
				index = Integer.valueOf(scanner.nextLine());
				flag = true;
			} catch (NumberFormatException e) {
				Printer.print(NOT_NUMBER);
			}
		}
		return index;
	}

	public String getString() {
		return scanner.nextLine();
	}

	@Override
	protected void finalize() throws Throwable {
		scanner.close();
		super.finalize();

	}
}
