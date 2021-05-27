package test;

import java.util.Scanner;

public class challenge3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // no of elements.

		int k = sc.nextInt(); // value of k
		
		int[] nums = new int[n]; 
		
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt(); 
		}
		
		System.out.println(countGame(nums,k));

	}

	public static int countGame(int[] arr, int k) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			int rem = arr[i] % k; // remainder

			int temp = arr[i] - rem; // subtracting remainder from given number

			int noOfKs = temp / k; // no of k's when added.

			if (rem != 0) {
				count += noOfKs + 1; // adding 1 as remainder kuch to bacha hoga..(if not 0)
			} else {
				count += noOfKs;
			}

		}

		return count;
	}

}
