package com.lera.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Logger;

import com.lera.controller.Constant;
import com.lera.repository.MainRepository;

public class Serializer {
	
	private static final Logger log = Logger.getLogger(Serializer.class.getName());

	public static void serialize(MainRepository mainRepository, String filePath) {
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
			objectOutputStream.writeObject(mainRepository);
			objectOutputStream.close();
		} catch (IOException e) {
			log.warning(Constant.SOME_OTHER_EXCEPTION);
		}
	}

	public static MainRepository desirialize(String filePath){
		MainRepository mainRepository = null;
		try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
			mainRepository = (MainRepository) objectInputStream.readObject();
			objectInputStream.close();
			return mainRepository;
		} catch (ClassNotFoundException e) {
			log.warning(Constant.CLASS_NOT_FOUND);
		} catch (FileNotFoundException e) {
			log.warning(Constant.FILE_DOSNT_EXIST);
		} catch (IOException e) {
			log.info(Constant.SOME_OTHER_EXCEPTION);
		}
		return mainRepository;
	}

}
