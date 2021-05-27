package hackerBlocksSolutions2;

import java.util.Scanner;

public class StringToggleCase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next(); 
		
		System.out.println(toggleCase(s)); 
	}
	
	public static String toggleCase(String str) {
		
		for(int i = 0; i < str.length() ; i++) {
			
			if(Character.isUpperCase(str.charAt(i))){
				str = str.replace(str.charAt(i), Character.toLowerCase(str.charAt(i)));
			}
			else {
				str = str.replace(str.charAt(i), Character.toUpperCase(str.charAt(i)));
			}
		}
		
		return str;
		
	}

}
