package hackerBlocksSolutions2;

import java.util.Scanner;

public class stringCompression {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String str = s.next();

		String res = new String();

		int i = 0;

		int count = 1;

		while (i < str.length()) {

			// handling last char..
			if (i == str.length() - 1) {
				if (str.charAt(i - 1) != str.charAt(i)) {
					res += "" + str.charAt(i);
				} else {
					res += "" + str.charAt(i) + count;
				}
			} else if (str.charAt(i) == str.charAt(i + 1)) {
				// means next char is same.
				count++;
			} else {
				// next char is different.
				// we need to check our count here now.

				if (count == 1) {
					// occurs only once.
					res += "" + str.charAt(i);
				} else {
					res += "" + str.charAt(i) + count;
				}

				// resetting count.

				count = 1;

			}

			// changes
			i++;
		}

		System.out.println(res);
	}

}
