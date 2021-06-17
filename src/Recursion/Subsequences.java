package Recursion;

import java.util.Scanner;

public class Subsequences {
	
	static int count = 0; 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next(); 

		subseq(s, "");
		
		System.out.println(count);

	}

	public static void subseq(String s, String ans) {

		if (s.length() == 0) {
			System.out.print(ans + " ");
			count++; 
			return;
		}

		String ss = s.substring(1);

		char c = s.charAt(0);

		// not included
		subseq(ss, ans);

		// included
		subseq(ss, ans + c);

	}

}
