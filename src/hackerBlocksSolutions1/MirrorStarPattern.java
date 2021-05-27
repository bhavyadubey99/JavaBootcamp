package hackerBlocksSolutions1;

import java.util.Scanner;

public class MirrorStarPattern {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int row = 1; 
		int nst = 1;
		int nsp = n/2;
		
		while(row <= n) {
			
			//work 
			
			//spaces
			for(int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}
			
			//stars
			for(int cst = 1; cst <= nst; cst++) {
				System.out.print("*\t");
			}
			
			//changes
			System.out.println();
			
			if(row <= n/2) {
				nsp = nsp - 1;
				nst = nst + 2;
			}
			else {
				nsp = nsp + 1;
				nst = nst - 2;
				
			}
			row++; 
		}
	}

}
