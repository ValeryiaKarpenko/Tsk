package task7;

public class Task7 {
	public static void main(String[] args) {
		int n=5;
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = (int)Math.round(Math.random()*100);
			System.out.println(arr[i]);
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 0; i < n; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);
	}
}
