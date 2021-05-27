package hackerBlocksSolutions1;

import java.util.Scanner;

public class PatternInvertedHourGlass {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int nst = 1;
		int nsp = (2 * n) - 1;
		int val = n; 

		while (row <= (2 * n) + 1) {
			
			//star
			for (int cst = 1; cst <= nst; cst++) {
				if(row == n+1 && cst == n+1) {
					System.out.print("0 ");
				}
				else {
					System.out.print(val + " ");
					val--;
				}
				
			}
			
			//space
			for(int csp = 1; csp <= nsp; csp++) {
				System.out.print("  ");
			}
			
			//star 
			int cst = 1;
			
			if(row == n+1)
				cst = 2;
			for(; cst <= nst; cst++) { 
				val++;
				System.out.print(val + " ");
				

			}
			
			//changes
			System.out.println();
			if(row <= n) {
				nsp = nsp - 2; 
				nst = nst + 1;
			}
			else {
				nsp = nsp + 2; 
				nst = nst - 1; 
			}
			
			row = row + 1;

		}

	}
}
