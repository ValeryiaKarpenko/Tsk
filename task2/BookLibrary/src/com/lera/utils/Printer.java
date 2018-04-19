package com.lera.utils;

import java.util.List;

import com.lera.model.Entity;

public class Printer {
	public static void print(String str) {
		System.out.println(str);
	}

	public static void print(Entity entity) {
		print(entity.toString());
	}

	public static void printArray(List<? extends Entity> listBook) {
		for (Entity entity : listBook) {
			if (entity != null) {
				print(entity);
			}
		}
	}
}
