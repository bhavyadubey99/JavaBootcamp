package hackerBlocksSolutions1;

import java.util.Scanner;

public class printSeries {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int n = 1;
		
		int count = 1;
		
		// 3n + 2 series. 
		
		while(count <= n1) {
			int memberOfSeries = (3 * n) + 2;
			
			if(memberOfSeries % n2 != 0) {
				System.out.println(memberOfSeries);
				count += 1;
			}
			n += 1;
			
		}
	}

}
