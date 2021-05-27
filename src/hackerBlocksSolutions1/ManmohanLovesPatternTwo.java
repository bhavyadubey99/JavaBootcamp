package hackerBlocksSolutions1;

import java.util.Scanner;

public class ManmohanLovesPatternTwo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.close();

		int row = 1;
		int nst = 1;
		int val = 1;

		while (row <= n) {

			// stars

			for (int cst = 1; cst <= nst; cst++) {
				if (cst == 1 && row == 1) {
					System.out.print(val);
					val--;
				} else if (cst == 1 || cst == nst) {
					System.out.print(val + " ");
				} else {
					System.out.print(0 + " ");
				}
			}

			// changes
			System.out.println();
			row++;
			nst++;
			val++;

		}

	}
}
