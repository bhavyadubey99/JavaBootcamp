package Recursion;

import java.util.Scanner;

public class XAtEnd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		StringBuilder sb = new StringBuilder();

		move(s, sb, 0);
	}

	public static void move(String s, StringBuilder ans, int count) {

		if (s.length() == 0) {
			for (int i = 1; i <= count; i++) {
				ans.append('x');
			}
			System.out.println(ans);
			return;
		}

		String ss = s.substring(1);

		char c = s.charAt(0);

		if (c == 'x') {
			move(ss, ans, count + 1);
		} else {
			move(ss, ans.append(c), count);
		}

	}

}
