package Recursion;

public class DuplicateCharacter {

	public static void main(String[] args) { 
		
		dupchar("Cutee", ' ', "");

	}

	public static void dupchar(String s, char lastChar, String ans) {

		if (s.length() == 0) {
			System.out.println(ans);
			return;
		}

		String ss = s.substring(1);

		char lc = s.charAt(0);

		if (lastChar == lc) {
			dupchar(ss, lc, ans + "*" + lc);
		} else {
			dupchar(ss, lc, ans + lc);
		}

	}

}
