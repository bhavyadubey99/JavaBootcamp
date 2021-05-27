package hackerBlocksSolutions1;

import java.util.Scanner;

public class DownwardTriangle {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int row = 1;
		int nst = n; 
		int nsp = 0; 
		
		while(row <= n) {
			
			//work
			
			//spaces
			for(int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			
			//stars
			for(int cst = 1; cst <= nst; cst++) {
				System.out.print("* ");
			}
			
			
			//changes
			System.out.println();
			row++;
			nsp++; 
			nst--;
			
		}
		
		
	}

}
