package task2;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println ("write a and b: ");
		int a = k.nextInt();
		int b = k.nextInt();

		System.out.println("sum = " + sum(a,b));
		System.out.println("diff = " + diff(a,b));

		System.out.println("nok = " + nok(a,b));
		System.out.println("nod = " + nod(a,b));

	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static int diff(int a, int b) {
		return a - b;
	}

	public static int nod(int a, int b) {
		while (a != 0 && b != 0) {
			if (a > b) {
				a %= b;
			} else {
				b %= a;
			}
		}
		return a + b;
	}

	public static int nok(int a, int b) {
		int nod = nod(a, b);
		return (a / nod) * b;
	}
}
