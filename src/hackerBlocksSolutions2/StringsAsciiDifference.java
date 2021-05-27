package hackerBlocksSolutions2;

import java.util.Scanner;

public class StringsAsciiDifference {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next(); 
		
		String res = ""; 
		
		for(int i = 0; i < s.length() - 1; i++) {
			char one = s.charAt(i);
			char two = s.charAt(i+1);
			
			int diff = (int)two - (int)one;
			
			if(i == s.length() - 2)
				res += "" + one + diff + "" + two;
			else
				res += "" + one + diff; 
			
			
		}
		
		System.out.println(res);
	}

}
