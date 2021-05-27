package hackerBlocksSolutions1;

import java.util.Scanner;

public class ManmohanLovesPatternOne {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int row = 1; 
		int nst = 1;
		
		while(row <= n) {
			//work 
			
			//stars
			for(int cst = 1; cst <= nst; cst++) {
				if(row % 2 != 0) {
					System.out.print("1 ");
				}
				else if(cst == 1 || cst == nst ) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
				
			}
			
			//changes
			System.out.println();
			
			row++; 
			nst++;
		
		}
		
		
	}
}
