package hackerBlocksSolutions1;

import java.util.Scanner;

public class PatternPascalsTriangle {
	
	static int factorial(int n) {
		int fact = 1;
		int  count = 2; 
		while (count <= n) {
			fact = fact * count; 
			count++ ;
		}
		return fact; 
		
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int row = 0;
		int nst = 1; 
		s.close();

		while (row < n) {

			// stars

			for (int cst = 0; cst < nst; cst++) {
				
				// row C cst 
				System.out.print(factorial(row)/ (factorial(cst) * (factorial(row-cst))) + "\t");
				
				
				
			}

			// changes

			System.out.println();
			row = row + 1;
			nst = nst + 1;
		}
		
	}
}
