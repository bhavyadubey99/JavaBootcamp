package Recursion;

import java.util.Scanner;

public class removeDuplicates {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		String a = sc.nextLine(); 
		
		removeDups(a, ' ', "");

	}

	public static void removeDups(String s, char lastChar, String ans) {

		if (s.length() == 0) {
			System.out.println(ans);
			return;
		}

		String ss = s.substring(1);

		char lc = s.charAt(0);

		if (lastChar == lc) {
			removeDups(ss, lc, ans);
		} else {
			removeDups(ss, lc, ans + lc);
		}

	}
}
