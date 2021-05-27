package hackerBlocksSolutions2;

import java.util.Scanner;

public class StringOddEven {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		String str = sc.next(); 
		
		String res = new String(); 
		
		for(int i = 0; i < str.length(); i++) {
			
			if(i % 2 !=0) {
				//odd acc to normal count
				
				int asval = str.charAt(i) - 1 ; 
				
				res += (char)asval;
				
			}
			else {
				//even acc to normal count
				int asval = str.charAt(i) + 1; 
				
				res += (char)asval;
				
			}
			
		}
		
		System.out.println(res);
		
		
	}

}
