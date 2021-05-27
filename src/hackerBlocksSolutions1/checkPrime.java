package hackerBlocksSolutions1;

import java.util.Scanner;

public class checkPrime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int factors = 2;
		
		for(int i = 2;i <= Math.sqrt(n);i++) {
			if(n % i == 0) {
				factors += 1;
			}
		}
		
		if(factors > 2) {
			System.out.println("Not Prime");
		}
		else {
			System.out.println("Prime");
		}

	}

}
