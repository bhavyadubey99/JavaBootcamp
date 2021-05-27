package hackerBlocksSolutions1;

import java.util.Scanner;

public class PatternRhombus {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		int val = 1;

		while (row <= (2 * n) - 1) {
			int col = val + 1;
			// work

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				
			if(cst == 1 || cst == nst) {
				System.out.print(val + " ");
			}
			else if (cst <= (nst/2)){
				System.out.print(col + " ");
				col++;
			}
			else {
				System.out.print(col + " ");
				col--;
			}
			}

			// changes
			System.out.println();

			if (row < n) {
				nst = nst + 2;
				nsp = nsp - 1;
				val = val + 1;
			} else {
				nst = nst - 2;
				nsp = nsp + 1;
				val = val - 1;
			}

			row = row + 1;
		}

	}
}