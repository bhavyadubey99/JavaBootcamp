package hackerBlocksSolutions1;

import java.util.Scanner;

public class HollowRhombus {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int row = 1; 
		int nst = n; 
		int nsp = n - 1;
		
		while(row <= n) {
			
			//work 
			
			//spaces
			for (int csp = 1; csp <= nsp;csp++) {
				System.out.print("  ");
			}
			
			//star 
			for (int cst = 1; cst <= nst; cst++) {
				if(row == 1 || row == n || cst == 1 || cst == nst) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			//changes
			System.out.println();
			nsp = nsp - 1;
			row = row + 1;
		}
	}

}
