package task5;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		System.out.print("write sentense: ");
		Scanner scan = new Scanner(System.in);
		String sentense = scan.nextLine();
		String word = scan.nextLine();

		sentense = sentense.toLowerCase();
		sentense = deleteSigns(sentense);
		String[] str = createArray(sentense);
		findThisWord(str, word);

	}

	public static String deleteSigns(String sentense) {
		return sentense.replace(",", "");
	}

	public static String[] createArray(String sentense) {
		String[] str = sentense.split(" ");
		return str;
	}

	public static void findThisWord(String[] str, String word) {
		int n = 0;
		for (int i = 0; i < str.length; ++i) {
			if (str[i].equals(word)) {
				n += 1;
			}
		}
		System.out.println("word contains " + n + " times");
	}

}
