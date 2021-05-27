package hackerBlocksSolutions1;

import java.util.Scanner;

public class countDigits {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int number = scn.nextInt();
		
		int digit = scn.nextInt();
		
		int countOfDigit = 0;
		
		while(number > 0) {
			int rem = number % 10;
			if (rem == digit) {
				countOfDigit += 1;
			}
			number = number / 10;
			
		}
		System.out.println(countOfDigit);

	}

}
