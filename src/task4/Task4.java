package task4;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {

		String sentense = writeSentense();
		sentense = deleteSigns(sentense);
		sentense = sentense.toLowerCase();
		String[] arr = createArray(sentense);
		sum(arr);
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static String writeSentense() {
		System.out.print("write sentense: ");
		Scanner scan = new Scanner(System.in);
		String sentense = scan.nextLine();
		return sentense;
	}

	public static String deleteSigns(String sentense) {
		return sentense.replace(",", "");
	}

	public static String[] createArray(String sentense) {
		String[] str = sentense.split(" ");
		return str;
	}

	public static void sum(String[] str) {
		System.out.println("sum = " + str.length);
	}

}
