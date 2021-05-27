
package hackerBlocksSolutions2;

import java.util.Scanner;

public class stringRemoveDuplicates {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String str = s.next();

		int left = 0 ;
		int right = 0; 
		
		int count = 0; 
		
		while(right < str.length()) {
			if(str.charAt(left) == str.charAt(right)) {
				count++;
				right++;
			}
			
			else {
				
				System.out.print(str.charAt(left));
				left = right; 
			}
		}
		
		//handling the last character. 
		
		System.out.print(str.charAt(str.length() - 1));

	}

}
