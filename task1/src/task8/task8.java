package task8;

import java.util.Scanner;

public class task8 {
	public static void main(String[] args) {
		int n = writeNum();
		isMirror(n);
	}

	public static int writeNum() {
		System.out.print("write n: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		return n;
	}

	public static void isMirror(int n) {
		for (int i = 1; i < n; i++) {
			int a = i % 10;
			int b = i / 10;
			if (b == a) {
				System.out.print(i + " ");
			}
		}
	}

}