package task5;

public class Task5 {
	public static void main(String[] args) {
		String str1 = "Hello, i am Lera, hello";
		String word = "hello";
		int n = 0;
		
		String str2 = str1.toLowerCase(); 
		str2 = str2.replace(",", "");
		String[] str = str2.split(" ");
		
		for (int i = 0; i<str.length; ++i) {
			if (str[i].contains(word)) {
				n += 1;
			}
		}
		System.out.println("word contains " + n + " times");
	}
}
