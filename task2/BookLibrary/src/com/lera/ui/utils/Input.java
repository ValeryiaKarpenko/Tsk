package com.lera.ui.utils;

import java.io.InputStream;
import java.util.Scanner;

public class Input {
	private static Input instance;
	private Scanner scanner;

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
		return Integer.valueOf(scanner.nextLine());
	}
	
	public String getString() {
		return scanner.nextLine();
	}
}
