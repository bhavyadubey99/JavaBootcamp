package practiceQuestionsExtra;

public class CountAndSay {

	public static void main(String[] args) {
		System.out.println(countAndSay(3));

	}

	public static String compress(String str) {

		int count = 1;
		String res = "";
		for (int i = 0; i < str.length() - 1; i++) {

			if (str.charAt(i) == (str.charAt(i + 1))) {
				// match
				count++;
			} else {
				// mismatch
				res = res + count + str.charAt(i);

				// count reset
				count = 1;
			}

		}

		// last character
		res = res + count + str.charAt(str.length() - 1) + "";

		return res;

	}

	public static String countAndSay(int n) {
		if(n == 1) {
			return "1"; 
		}
		
		String recRes = countAndSay(n -1); 
		
		return compress(recRes); 

	}
}
