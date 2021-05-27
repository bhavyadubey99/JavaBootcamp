package hackerBlocksSolutions1;

import java.util.Scanner;

public class PatternMagic {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nst = n;
		int nsp = -1;

		while (row <= ((2 * n) - 1)) {

			// stars
			int cst = 1;
			
			if(row == 1 || row == 2*n - 1)
				cst = 2;
			for (; cst <= nst; cst++) {
				System.out.print("* ");
			}

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}

			// stars
			for (cst = 1; cst <= nst; cst++) {
				System.out.print("* ");
			}

			// changes
			System.out.println();

			if (row <= (2 * n - 1) / 2) {
				nst = nst - 1;
				nsp = nsp + 2;
			} else {
				nst = nst + 1;
				nsp = nsp - 2;
			}
			row = row + 1;
		}
	}

}
