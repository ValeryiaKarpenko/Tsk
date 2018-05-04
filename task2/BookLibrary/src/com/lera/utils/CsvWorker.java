package com.lera.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import com.lera.controller.Constant;

public class CsvWorker {

	private static Scanner scan;

	public static void write(String str, String filePath) {
		try(FileWriter fw = new FileWriter(new File(filePath))){
		fw.write(str);
		fw.close();
		} catch (Exception e) {
			Printer.print(Constant.SOME_OTHER_EXCEPTION);
			
		}

	}

	public static void read(String filePath) {
		try(FileReader fr = new FileReader(filePath)){
		scan = new Scanner(fr);
		while (scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}
		fr.close();
		} catch (FileNotFoundException e) {
			Printer.print(Constant.FILE_DOSNT_EXIST);
		} catch (Exception e) {
			Printer.print(Constant.SOME_OTHER_EXCEPTION);
		}
	}

}
