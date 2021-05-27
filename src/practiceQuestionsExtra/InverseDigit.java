package practiceQuestionsExtra;

import java.util.Scanner;

public class InverseDigit {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int position = 1 ;
		
		int invnum = 0;
		
		while(n > 0) {
			int rem = n % 10; 
			
			invnum = invnum + (position * (int)Math.pow(10, rem-1));
			
			position++; 
			n = n /10 ; 
		}
		
		System.out.println(invnum);
	}

}
