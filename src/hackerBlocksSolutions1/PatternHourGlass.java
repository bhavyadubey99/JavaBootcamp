package hackerBlocksSolutions1;


public class PatternHourGlass {

	public static void main(String[] args) {

		int row = 1;

		int n = 4;

		int nsp = 0;
		int nst = 2 * n + 1;
		int val = n;

		while (row <= 2*n + 1) {

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val + " ");
				if(cst <= nst/2) {
					val = val - 1;
				}
				else {
					val = val + 1;
				}
			}

			// changes
			System.out.println();

			if (row <= n) {
				nsp = nsp + 1;
				nst = nst - 2;
				val = val - 2;

			} else {
				nsp = nsp - 1;
				nst = nst + 2;
				val = (nst - 1)/2;    // for 7 stars to be printed. the number starts from 3, always. 2 * 3 +1 = 7 , meaning 2 * val + 1 = nst
			}
			
			row = row + 1;
		}
	}

}
