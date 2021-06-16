package LeetCodePractice;

import java.util.Scanner;

public class PatternandNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int ns = n;
		int valcount = n;
		int nst = 0;
		while (row <= n) {

			int val = 1;
			for (int cst = 1; cst <= valcount; cst++) {
				System.out.print(val + " ");
				val++;
			}
			// stars
			for (int cst = 1; cst < nst; cst++) {
				System.out.print("* ");
			}
			// next row
			System.out.println();
			row++;
			valcount--;
			ns++;
			nst += 2;
		}
	}

}
