package hackerBlocksSolutions2;

import java.util.Scanner;

public class CanYouReadThisCamelCase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		String res = "" + str.charAt(0); 
		
		int i = 0; 
		int j = 1; 
		
		while(j < str.length()) {
			if(Character.isUpperCase(str.charAt(j))) {
				System.out.println(res);
				res = "" + str.charAt(j); 
				i = j; 
				j++; 

			}
			else if(Character.isLowerCase(str.charAt(j))){
				res += str.charAt(j);
				j++;
			}
			else {
				System.out.println(res);
				res = "" + str.charAt(j); 
				i = j;
				j++;
			}
			
		}
		
		System.out.println(res);
		
		
	}

}
