package com.lera.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.lera.repository.MainRepository;

public class Serializer {

	private static ObjectInputStream objectInputStream;

	public static void serialize(MainRepository mainRepository, String filePath) throws IOException {
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
		objectOutputStream.writeObject(mainRepository);
		objectOutputStream.close();
	}

	public static MainRepository desirialize(String filePath) throws ClassNotFoundException, IOException {
		MainRepository mainRepository = null;
		objectInputStream = new ObjectInputStream(new FileInputStream(filePath));
		mainRepository = (MainRepository) objectInputStream.readObject();
		return mainRepository;
	}

}
