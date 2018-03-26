package task6;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("write a, b, c: ");
		int a = k.nextInt();
		int b = k.nextInt();
		int c = k.nextInt();
		isRectangular(a, b, c);

	}

	public static void isRectangular(int a, int b, int c) {
		int q = 2;
		if (Math.pow(a, q) == (Math.pow(b, q) + Math.pow(c, q)) || Math.pow(b, q) == (Math.pow(a, q) + Math.pow(c, q))
				|| Math.pow(c, q) == (Math.pow(b, q) + Math.pow(a, q))) {
			System.out.println("triangle is rectangular");
		} else
			System.out.println("triangle isnt rectangular");
	}

}
