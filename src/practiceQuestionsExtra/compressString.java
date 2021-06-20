package practiceQuestionsExtra;

import java.util.Scanner;

public class compressString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int count = 1;

		if (s.length() == 1) {
			System.out.print(s.charAt(0) + "1");
		} else {

			for (int i = 0; i < s.length() - 1; i++) {

				if (s.charAt(i) == s.charAt(i + 1)) {
					count++;
				} else {
					System.out.print(s.charAt(i) + "" + count);
					count = 1;
				}

			}

			if (s.charAt(s.length() - 1) == s.charAt(s.length() - 2)) {

				System.out.print(s.charAt(s.length() - 1) + "" + count);
			} else {
				System.out.print(s.charAt(s.length() - 1) + "1");
			}
		}
	}

}
