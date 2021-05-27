package hackerBlocksSolutions1;

import java.util.Scanner;

public class Chewbacca {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int temp = n;
		int lowest = n;
		int place = 1;
		
		while(n > 0) {
			
			int rem = lowest % (place*10);
			
			int digit_inverted = rem / place;

			
			int numberFormed = (lowest - (digit_inverted * place)) + ((9 - digit_inverted) * place) ;
			
			if(numberFormed < lowest) {
				lowest = numberFormed;
			}
			
			//changes
			place = place * 10;
			n /= 10;
		}
		
		System.out.println(lowest);
	}

}
