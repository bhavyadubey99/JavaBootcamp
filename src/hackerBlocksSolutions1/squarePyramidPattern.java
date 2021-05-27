package hackerBlocksSolutions1;

import java.util.Scanner;

public class squarePyramidPattern {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		s.close();
		
		int row = 1; 
		int nst = 1; 
		
		
		
		while(row <= n) {
			int val = 1;
			
			for(int cst = 1; cst <= nst; cst++) {
				System.out.print((val * val) + " ");
				val++;
			}
			
			//changes
			System.out.println();
			
			row++;
			nst++;
			
		}
	}

}
