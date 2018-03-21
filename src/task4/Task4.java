package task4;

import java.util.Arrays;

public class Task4 {
	public static void main(String[] args) {
		String str1 = "Hello, i am Lera, hello";
		
		String str2 =  str1.replace(",", "");
		str2 = str2.toLowerCase();
		String[] str = str2.split(" ");
		int sum = str.length;
		Arrays.sort(str);
		System.out.println("sum = " + sum);
		System.out.println(Arrays.toString(str));
  }
}
