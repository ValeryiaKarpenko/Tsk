package task8;

public class task8 {
	public static void main(String[] args) {
		int n = 100;
		
		for (int i = 1; i < n; i++) {
			int a = i % 10;
			int b= i / 10;
			if(b == a) {
			System.out.print(i+" ");
			}
		}
	}
}