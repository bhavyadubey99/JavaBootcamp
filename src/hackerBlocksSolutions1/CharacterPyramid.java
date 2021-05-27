package hackerBlocksSolutions1;

import java.util.Scanner;

public class CharacterPyramid {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		int row = 1; 
		
		int nst = 1; 
		
		while(row <= n) {
			char c1 = 'a';
			char c2 = 'b';
			
			int val = 0;
			
			// work
			 //stars
			
			for(int cst = 1; cst <= nst; cst++) {
				if(row % 2 != 0) {
					System.out.print((char)(c1+val) + " ");
					val += 2;
				}
				else {
					System.out.print((char)(c2 + val) + " ");
					val += 2; 
				}
				
			}
			
			//changes
			System.out.println();
			row++;
			nst++;
		}
	}

}
