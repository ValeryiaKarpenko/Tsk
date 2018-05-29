package com.lera.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.lera.controller.Constant;
import com.lera.main.Main;
import com.lera.model.Book;
import com.lera.model.Entity;
import com.lera.model.Person;

public class CsvWorker {

	private static final Logger log = Logger.getLogger(CsvWorker.class.getName());
	private static BufferedReader br = null;

	public static void write(List<? extends Entity> objectList, String filePath) {
		try (FileWriter fw = new FileWriter(new File(filePath))) {
			StringBuffer sb = new StringBuffer();
			for (Entity object : objectList) {
				if (object instanceof Book) {
					sb.append(object.getId()).append(";").append(((Book) object).getName()).append(";")
							.append(((Book) object).getAuthor()).append("\n");
				} else if (object instanceof Person) {
					sb.append(object.getId()).append(";").append(((Person) object).getFio()).append("\n");
				}
			}
			fw.write(sb.toString());
		} catch (Exception e) {
			log.info(Constant.SOME_OTHER_EXCEPTION);
			Printer.print(Constant.SOME_OTHER_EXCEPTION);
		} 
	}

	public static List<Book> read(String filePath) {
		try {
			FileInputStream fstream = new FileInputStream(filePath);
			br = new BufferedReader(new InputStreamReader(fstream));
			List<Book> listBooks = new ArrayList<Book>();
			String strLine;
			while ((strLine = br.readLine()) != null) {
				String[] mas = strLine.split(";");
				listBooks.add(Main.createBook(mas[0], mas[1]));
			}
			return listBooks;
		} catch (FileNotFoundException e) {
			log.info(Constant.FILE_DOSNT_EXIST);
			Printer.print(Constant.FILE_DOSNT_EXIST);
		} catch (Exception e) {
			log.info(Constant.SOME_OTHER_EXCEPTION);
			Printer.print(Constant.SOME_OTHER_EXCEPTION);
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				log.info(Constant.SOME_OTHER_EXCEPTION);
				Printer.print(Constant.SOME_OTHER_EXCEPTION);
			}
		}
		return null;
	}
}
