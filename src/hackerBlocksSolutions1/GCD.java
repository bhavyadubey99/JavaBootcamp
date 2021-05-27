package hackerBlocksSolutions1;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		
		int maximum = Math.max(n1, n2);
		int count = maximum;
		while(count >= 1) {
			if ((n1 % count == 0)&&(n2 % count == 0)){
				System.out.println(count);
				break;
			}
			count = count - 1;
		}

	}

}
