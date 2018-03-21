package task9;

public class Task9 {
	public static void main(String[] args) {
		int n = 5;
		int sum = 0;
		
		for (int i = 1; i < n + 1; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
				sum += i;
			} 
		}
		System.out.print("sum = " + sum);
	}

}
