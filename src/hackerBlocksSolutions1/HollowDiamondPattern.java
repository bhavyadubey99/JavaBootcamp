package hackerBlocksSolutions1;

import java.util.Scanner;

public class HollowDiamondPattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int row = 1;
		int nst = (n / 2) + 1;
		int nsp = -1;

		while (row <= n) {

			// work

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*\t");
			}
			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}
			// stars
			int cst = 1; 
			
			if(row == 1 || row == n) {
				cst += 1; 
			}
			for (; cst <= nst; cst++) {
				System.out.print("*\t");
			}

			// changes

			System.out.println();

			if (row <= (n / 2)) {
				nsp += 2;
				nst -= 1;
			} else {
				nsp -= 2;
				nst += 1;
			}
			row++;

		}
		s.close();
	}
}
