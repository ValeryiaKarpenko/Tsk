package task10;

public class Task10 {
	public static void main(String[] ars) {
		int a = 2;
		int b = 3;
		int c = 4;
		
		if (a > 0) {
			System.out.print(a + "" + b + "" + c + "  " + a + "" + c + "" + b + " ");
		}
		
		if (b > 0) {
			System.out.print(b + "" + a + "" + c + "  " + b + "" + c + "" + a + " ");
		}
		
		if (c > 0) {
			System.out.print(c + "" + a + "" + b + "  " + c + "" + b + "" + a + " ");
		}
		
	}
}
