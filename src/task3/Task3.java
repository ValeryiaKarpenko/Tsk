package task3;

public class Task3 {
	public static void main(String[] args) {
	    String a ="amdfdma";
		String b = "";
		
		for (int i = a.length()-1; i >= 0; i--) {
			b += a.charAt(i); 
		}
		if (a.equals(b)) {
			System.out.println("palindrome");	
		} 
		else {
			System.out.println("not a palindrome");
		}		
	}
}
