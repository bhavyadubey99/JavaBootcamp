package hackerBlocksSolutions3;

import java.util.ArrayList;
import java.util.Scanner;

public class CodesOfString {
	
	static ArrayList<String> res = new ArrayList<>();

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String ques = sc.next(); 
		
		stringcode(ques, ""); 
		System.out.println(res);

		

	}

	public static void stringcode(String ques, String ans) {
		
		//base case
		if(ques.length() == 0) {
			res.add(ans); 
			return; 
		}

		String roq1 = ques.substring(1);
		char ch1 = ques.charAt(0);
		char code = (char) (ch1 - '1' + 'a');
		stringcode(roq1, ans+code); 
		
		if(ques.length() >= 2 && ch1 <= '2') {
            int i = Integer.parseInt(ques.substring(0, 2), 10);
            if (i > 0 && i <= 26) {
                code = (char) (i + 'a' - 1);
                stringcode(ques.substring(2), ans + code);
            }
		}
		
		
		


	}

}
