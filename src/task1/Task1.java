package task1;

public class Task1 {
	public static void main(String[] args) {
		int n = 4;
		
		if (n%2 == 1) {
			System.out.println("number is odd");
		} 
		 else if (n%2 == 0) {
			System.out.println("number is even");
		}
		 else {
			 System.out.println("error, plese check your number");
		 }
		
		for (int i = 2; i < n; i++) {
			if (n%i == 0) {
				System.out.println("number is composite");
				break;
			}
			else if (n%i == 1){
				System.out.println("number is prime");
				break;
			}
			else {
				System.out.println("error, plese check your number");
			}	
		}
	
	}

}
