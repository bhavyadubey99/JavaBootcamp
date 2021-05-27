package hackerBlocksSolutions1;

import java.util.Scanner;

public class FibonacciTriangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		sc.close();

		int row = 1;

		int nst = 1; 
		
		int a = 0;
		int b = 1; 
		int sum;
		
		while (row <= n) {

			//work 
			
			// stars
			
			for(int cst = 1; cst <= nst; cst++) {
				System.out.print(a + " ");
				
				sum = a + b; 
				a = b; 
				b = sum; 
			}
			
			//changes
			System.out.println();
			
			row++;
			nst++;
		}

	}

}
