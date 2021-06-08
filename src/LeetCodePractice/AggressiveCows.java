package LeetCodePractice;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nos = sc.nextInt();
		int noc = sc.nextInt();

		int[] stall = new int[nos];

		for (int i = 0; i < nos; i++) {
			stall[i] = sc.nextInt();
		}

		Arrays.sort(stall);

		int ans = 0;

		// binary search
		int lo = 0; // min dist
		int hi = stall[stall.length - 1] - stall[0]; // max dist = last stall - first stall

		while (lo <= hi) {
			int mid = (lo + hi) / 2;

			if (canPlaceCow(stall, noc, mid)) {
				// move right
				lo = mid + 1;
				ans = mid;
			} else {
				hi = mid - 1;
			}
		}

		System.out.println(ans);
		sc.close();
	}

	public static boolean canPlaceCow(int[] stall, int noc, int mid) {
		//mid is the min dist we require to place the cow
		
		int cowsPlaced = 1; 
		int lastPos = stall[0]; 
		
		for(int i = 0; i < stall.length; i++) {
			if(stall[i] - lastPos >= mid) {
				//min dist hai. 
				//place the cow. 
				cowsPlaced++; 
				lastPos = stall[i];
				
				if(cowsPlaced == noc) {
					return true;
					
				}
			}
		}
		
		
		return false;
	}

}
