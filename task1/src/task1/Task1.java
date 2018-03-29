package task1;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		int n = writeNum();
		boolean isChet = isChet(n);
		boolean isPrime = isPrime(n);
		if (isChet && isPrime) {
			System.out.println("chet and prime");
		} else if (isChet && !isPrime) {
			System.out.println("chet and not prime");
		} else if (!isChet && isPrime) {
			System.out.println("not chet and prime");
		} else {
			System.out.println("not chet and not prime");
		}
	}

	public static boolean isChet(int n) {
		if (n % 2 == 0) {
			return true;
		}
		return false;
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return true;
			}
		}
		return false;
	}

	public static int writeNum() {
		System.out.print("write n: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		return n;
	}
}
