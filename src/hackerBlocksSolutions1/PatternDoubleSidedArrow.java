package hackerBlocksSolutions1;

import java.util.Scanner;

public class PatternDoubleSidedArrow {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int row = 1;
		int nsp1 = n - 1;
		int nst = 1;
		int nsp2 = -1;
		int temp; 
		int val = 1;
		int row_start = 1; 

		while (row <= n) {
			val = row_start;

			// spaces

			for (int csp = 1; csp <= nsp1; csp++) {
				System.out.print("  ");
			}

			// stars

			for (int cst = 1; cst <= nst; cst++) {

				if (row == 1 || row == n) {
					System.out.print("1 ");
					break;
				} else{
					System.out.print(val + " ");
					val--;  							//reducing value
				}
			}
			
			//spaces
			for (int csp = 1; csp <= nsp2; csp++) {
				if(row == 1 || row == n) {
					break;
				}
				else {
					System.out.print("  ");
				}
				
			}
			
			//stars 
			for (int cst = 1; cst <= nst; cst++) {

				if (row == 1 || row == n) {
					break;
				} else {
					if(val == 0)
						val++;
					System.out.print(val + " ");
					val++;
				}
			}
			

			// changes

			System.out.println();

			if (row <= n / 2) {
				nst += 1;
				nsp1 -= 2;
				nsp2 += 2;
				row_start++;
			}
			else {
				nst -= 1;
				nsp1 += 2;
				nsp2 -= 2; 
				row_start--;
			}
			
			row += 1; 

		}

	}

}
