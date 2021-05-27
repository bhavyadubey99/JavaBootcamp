package hackerBlocksSolutions1;

import java.util.Scanner;

public class replaceThemAll {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		
		long temp2 = n; 
		int cod = 0;
		
		while(temp2 > 0) {
			cod++;
			temp2 = temp2 / 10;
		}
		
		long temp = n; 
		int place = 1; 
		
		while(temp > 0) {
			long rem = n % 10; 
			
			if(rem == 0) {
				n = n + (5 * place);
			}
			
			place = place * 10; 
			temp = temp / 10; 
		}
		
		System.out.println(n);
		

	}
}
