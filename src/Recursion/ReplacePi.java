package Recursion;

import java.util.Scanner;

public class ReplacePi {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in); 

		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){

		StringBuilder sb = new StringBuilder();
		String s = sc.next();
		replace(s, ' ', sb);
	}

		
    }

	public static void replace(String s, char lastChar, StringBuilder ans) {

		if (s.length() == 0) {
			System.out.println(ans);
			return;
		}

		String ss = s.substring(1);

		char lc = s.charAt(0);

		if (lastChar == 'p' && lc == 'i') {
			ans.deleteCharAt(ans.length() - 1);
			replace(ss, ' ', ans.append("3.14"));
		} else {
			replace(ss, lc, ans.append(lc));
		}

	}

}
