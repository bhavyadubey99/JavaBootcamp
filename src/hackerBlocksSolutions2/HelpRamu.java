package hackerBlocksSolutions2;

import java.util.Scanner;

public class HelpRamu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int test = 1; test <= t; test++) {
			
			int c1 = sc.nextInt(); 
			int c2 = sc.nextInt(); 
			int c3 = sc.nextInt(); 
			int c4 = sc.nextInt(); 
			
			int n = sc.nextInt(); //no of rickshaws
			int m = sc.nextInt(); //no of cabs
			
			int[] rick = new int[n]; //to keep track of number of times ramu wants to visit ith rickshaw.
			int[] cab = new int[m]; //same for cab.
			
			for(int ai = 0; ai < n; ai++) {
				rick[ai] = sc.nextInt();
			}
			
			for(int bi =0; bi < m; bi++) {
				cab[bi] = sc.nextInt();
			}
			
			int minSomeRickshaw = 0; 
			int minSomeCab = 0; 
			
			for(int i = 0; i<n; i++) {
				minSomeRickshaw += Math.min((rick[i]*c1),c2);
			}
			
			int totalRick = Math.min(minSomeRickshaw, c3);
			
			for(int i = 0; i < m ; i++) {
				minSomeCab += Math.min((cab[i] * c1),c2);
			}
			
			int totalCab = Math.min(minSomeCab, c3);
			
			
			int res = Math.min(totalRick + totalCab, c4);
			
			System.out.println(res);
		}
	}
}
