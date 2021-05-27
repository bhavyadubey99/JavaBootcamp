package hackerBlocksSolutions1;

import java.util.Scanner;

public class PatternNumberLadder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 5; 
		
		int row = 1;
		int nst = 1;
		int val = 1;
		
		while(row <= n) {
			
			// work
			for(int cst = 1; cst <= nst; cst++) {
				System.out.print(val + "   ");
				val++;
			}
			
			//changes
			System.out.println();
			row++;
			nst++;
			
			
		}
	}
}
