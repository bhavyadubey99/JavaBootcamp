package practiceQuestionsExtra;

import java.util.Scanner;

public class StringOps {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		System.out.println(countPalindromicSubStrings2(str));

	}

	public static void printChars(String str) {

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

	public static void substrings(String str) {

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String substring = str.substring(i, j);
				System.out.print(substring + " ");
			}
			System.out.println();
		}
	}

	public static boolean palindrome(String str) {
		int i = 0;
		int j = str.length() - 1;

		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			} else {
				i++;
				j--;
			}
		}

		return true;

	}

	public static int palindromicSubstrings(String str) {

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String substring = str.substring(i, j);
				if (palindrome(substring)) {
					count++;
				}
			}

		}

		return count;
	}

	public static int oddLengthPalindromicSubstring(String str) {

		int count = 0;

		for (int axis = 0; axis < str.length(); axis++) {

			for (int orbit = 0; axis + orbit < str.length() && axis - orbit >= 0; orbit++) {

				if (str.charAt(axis - orbit) == str.charAt(axis + orbit)) {
					count++;
				} else {
					break;
				}
			}
		}

		return count;

	}

	public static int evenLengthPalindromicSubstring(String str) {

		int count = 0;

		for (double axis = 0.5; axis < str.length(); axis++) {

			for (double orbit = 0.5; axis + orbit < str.length() && axis - orbit >= 0; orbit++) {

				if (str.charAt((int) (axis + orbit)) == str.charAt((int) (axis - orbit))) {
					count++;
				}
				else {
					break;
				}
			}
		}

		return count;
	}
	
	public static int countPalindromicSubStrings2(String str) {
		
		return evenLengthPalindromicSubstring(str) + oddLengthPalindromicSubstring(str);
	}

}
