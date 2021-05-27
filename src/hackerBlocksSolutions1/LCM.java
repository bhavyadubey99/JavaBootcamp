package hackerBlocksSolutions1;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();

		int count = Math.max(n1, n2);
		
		while(count >= 1) {
			if((n1 % count == 0)&&(n2 % count == 0)) {
				break;
			}
			count -= 1;
		}
		
		int gcd = count; 
		int lcm = (n1 * n2)/gcd;
		
		System.out.println(lcm);
		
		

	}

}
