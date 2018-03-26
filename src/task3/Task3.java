package task3;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		String word = writeWord();
		String wordPalindrome = reverseWord(word);

		if (word.equals(wordPalindrome)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}

	public static String reverseWord(String word) {
		StringBuilder buffer = new StringBuilder(word);
		buffer.reverse();
		return buffer.toString();
	}

	public static String writeWord() {
		System.out.print("write word: ");
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		return word;
	}
}
