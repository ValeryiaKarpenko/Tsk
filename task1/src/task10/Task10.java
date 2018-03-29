package task10;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
	public static void main(String[] ars) {
		Scanner k = new Scanner(System.in);
		System.out.println("write a, b, c: ");
		int a = k.nextInt();
		int b = k.nextInt();
		int c = k.nextInt();
		createAllVariants(a, b, c);
	}

	public static void createAllVariants(int a, int b, int c) {
		int[] arr = new int[6];
			arr[0] = a * 100 + b * 10 + c;
			arr[1] = a * 100 + c * 10 + b;
			arr[2] = b * 100 + a * 10 + c;
			arr[3] = b * 100 + c * 10 + a;
			arr[4] = c * 100 + a * 10 + b;
			arr[5] = c * 100 + b * 10 + a;
		boolean mask[] = new boolean[arr.length];
		int removeCount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (!mask[i]) {
				int tmp = arr[i];

				for (int j = i + 1; j < arr.length; j++) {
					if (tmp == arr[j]) {
						mask[j] = true;
						removeCount++;
					}
				}
			}
		}

		int[] result = new int[arr.length - removeCount];

		for (int i = 0, j = 0; i < arr.length; i++) {
			if (!mask[i]) {
				result[j++] = arr[i];
			}
		}
		System.out.println(Arrays.toString(result));

	}
}
