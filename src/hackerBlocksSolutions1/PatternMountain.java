package hackerBlocksSolutions1;

import java.util.Scanner;

public class PatternMountain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// int n = sc.nextInt();
		int n = 4;
		int nst = 1;
		int row = 1;
		int nsp = n + 1;


		while (row <= n) {
			int val = 1;
			// work
			// star
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val + "\t");
				if(cst <= (2*n - 1)/2) {
					val++;
				}else {
					val--;
				}
			}

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" \t");
			}

			// star
			int cst = 1;
			int col = row;
			
			if(row == n) {
				cst = 2 ;
				col = row - 1;
			}
			
			for (; cst <= nst; cst++) {
				System.out.print(col + "\t");	
				col--;

			}

			// changes
			System.out.println();
			nsp = nsp - 2;
			nst++;
			row++;
		}

	}

}
