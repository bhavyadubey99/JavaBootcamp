package hackerBlocksSolutions1;

import java.util.Scanner;

public class PatternWithZeroes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int row = 1;
		int nst = 1;
		int val;

		while (row <= n) {
			val = row;

			// work

			for (int cst = 1; cst <= nst; cst++) {

				if (cst == 1 || cst == nst)
					System.out.print(val + " ");
				else
					System.out.print("0 ");
			}

			// changes
			System.out.println();
			row = row + 1;
			nst++;

		}

	}

}
