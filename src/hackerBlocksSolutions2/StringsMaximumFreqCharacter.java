package hackerBlocksSolutions2;

import java.util.Scanner;

public class StringsMaximumFreqCharacter {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String str = s.next();
		
		int l = 0; 
		int r = 0; 
		int count = 0; 
		char maxChar = str.charAt(0);
		int maxCount = Integer.MIN_VALUE; 
		
		while(r < str.length()) {
			if(str.charAt(l) == str.charAt(r)) {
				count++; 
				r++;
			}
			else {
				if(count > maxCount) {
					maxCount = count; 
					maxChar = str.charAt(l);
				}
				l = r; 
				count = 0; 
			}
			
			
		}
		
		System.out.println(maxChar);
	}

}
