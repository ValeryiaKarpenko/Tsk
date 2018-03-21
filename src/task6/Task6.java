package task6;

public class Task6 {
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c = 4;
		int q = 2;
		
		if (Math.pow(a, q) == (Math.pow(b, q) + Math.pow(c, q)) 
				|| Math.pow(b, q) == (Math.pow(a, q) + Math.pow(c, q))
				|| Math.pow(c, q) == (Math.pow(b, q) + Math.pow(a, q))) {
			System.out.println("triangle is rectangular");
		}
	}

}
