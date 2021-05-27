package hackerBlocksSolutions2;

import java.util.Scanner;

public class MaxValueInArray { 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(maxValue(arr));

	}

	public static int maxValue(int[] arr) {

		int max = Integer.MIN_VALUE;

		for (int val : arr) {
			if (val > max) {
				max = val;
			}
		}

		return max;
	}

}
