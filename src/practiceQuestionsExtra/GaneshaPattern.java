package practiceQuestionsExtra;

public class GaneshaPattern {

	public static void main(String[] args) {

		pattern(9);

	}

	public static void pattern(int n) {

		int row = 1;

		int nst = 1;

		int nsp = n / 3;

		while (row <= n) {

			// stars - 1st col
			for (int cst = 1; cst <= nst; cst++) {
				if (row <= (n / 2) + 1 || row == n)
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}

			// space - 1st one
			for (int csp = 1; csp <= nsp; csp++) {
				if (row == (n / 2) + 1 || row == n)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			// stars - 2nd col
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}

			// space - 2nd one
			for (int csp = 1; csp <= nsp; csp++) {
				if (row == (n / 2) + 1 || row == 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			// stars - 3rd col
			for (int cst = 1; cst <= nst; cst++) {
				if (row >= (n / 2) + 1 || row == 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			// changes
			row++;
			System.out.println();
		}

	}

}
