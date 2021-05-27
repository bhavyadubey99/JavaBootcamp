package hackerBlocksSolutions3;

import java.util.Scanner;

public class KeyPadCodes {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String ques = sc.next(); 
		
		KeyPadCode(ques , "");
		System.out.println();
		System.out.println(countOfKeyPadCode(ques, "", 0));
	}

	public static String getCode(char ch) {

		if (ch == '1') {
			return "abc";
		} else if (ch == '2') {
			return "def";
		} else if (ch == '3') {
			return "ghi";
		} else if (ch == '4') {
			return "jkl";
		} else if (ch == '5') {
			return "mno";
		} else if (ch == '6') {
			return "pqrs";
		} else if (ch == '7') {
			return "tuv";
		} else if (ch == '8') {
			return "wx";
		} else if (ch == '9') {
			return "yz";
		} else {
			return "";
		}

	}
	
	public static void KeyPadCode(String ques, String ans) {
		
		//base case
		if(ques.length() == 0) {
			System.out.print(ans + " ");
			return; 
		}
		
		String roq = ques.substring(1); 
		
		char ch = ques.charAt(0); 
		
		String code = getCode(ch); 
		
		// now there are many options - some are 4 some are 2 some are 2. 
		// using getCode function to find out how many options we have 
		// it will give us a string. for eg - 1 - "abc" --> means we have 3 options. 
		
		for(int i = 0; i < code.length(); i++) {
			KeyPadCode(roq, ans + "" + code.charAt(i)); //necessary to include... but what's going to be added... string[i] 
		}
	}
	
	public static int countOfKeyPadCode(String ques, String ans, int count) {
		
		//base case
		if(ques.length() == 0) {
			count++; 
			return count;
		}
		
		String roq = ques.substring(1); 
		
		char ch = ques.charAt(0); 
		
		String code = getCode(ch); 
		
		// now there are many options - some are 4 some are 2 some are 2. 
		// using getCode function to find out how many options we have 
		// it will give us a string. for eg - 1 - "abc" --> means we have 3 options. 
		
		int c = count; 
		
		for(int i = 0; i < code.length(); i++) {
			c = countOfKeyPadCode(roq, ans + "" + code.charAt(i),c); //necessary to include... but what's going to be added... string[i] 
		}
		
		return c;
	}

}
 