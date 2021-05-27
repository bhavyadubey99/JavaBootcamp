package test;

import java.util.Scanner;

public class challenge1 {
	
	public static void main(String[] args) {
		
		System.out.println(palindrome("aaabaa"));
		
		
	}
	
	public static String palindrome(String str) {
		
		String rev = new StringBuilder(str).reverse().toString(); // storing reverse using string builder in string 'rev' 
		
		for(int i = 0; i < str.length(); i++) {
			if(rev.substring(i).equals(str.substring(0, str.length()-i))) {
				return rev.substring(0,i) + str;
			}
		}
		
		return ""; 	
		
	}
	

}
