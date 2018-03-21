package task2;

public class Task2 {
	public static void main(String[] args){
		int a = 3;
		int b = 4;
		int sum = a + b;
		int diff =  a - b;
		int c = a;
		int d = b;
		
		System.out.println("sum = " + sum);
		System.out.println("diff = " + diff);
		

		while (a != 0 && b != 0) {
			if (a > b) {
				a %= b;
			}
			else {
			    b %= a;
			}
		}
		int nok = a + b;
		int nod = (c / nok) * d ;
		System.out.println("nok = " + nok);
		System.out.println("nod = " + nod);
		
	}
}
