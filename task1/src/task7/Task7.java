package task7;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		int n = writeLenghtArr();
		int[] arr = createRandomArray(n);
		System.out.println(Arrays.toString(arr));
		System.out.println(max(arr));
		System.out.println(min(arr));

	}

	public static int[] createRandomArray(int n) {
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = (int) Math.round(Math.random() * 100);
		}
		return arr;
	}

	public static int writeLenghtArr() {
		System.out.print("write n: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		return n;
	}

	public static int max(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int min(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
}
