package task9;

import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {
		int n = writeNum();
		sum(n);
	}

	public static int writeNum() {
		System.out.print("write n: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		return n;
	}

	public static void sum(int n) {
		int sum = 0;

		for (int i = 1; i < n + 1; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println("sum = " + sum);
	}

}
