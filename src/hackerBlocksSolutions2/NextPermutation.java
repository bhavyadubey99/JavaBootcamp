package hackerBlocksSolutions2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class NextPermutation {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int tc = sc.nextInt(); // no of test cases.

		for (int t = 1; t <= tc; t++) {

			int n = sc.nextInt(); // size of array.

			int[] arr = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			for (int i = arr.length - 1; i > 0; i--) {
				if(arr[i - 1] < arr[i]) {
					int max = arr[i];
					while(i < arr.length) {
						
					}
				}
			}

		}
	}

	public static int min(int[] arr, int idx1, int idx2) {
		int min = Integer.MAX_VALUE;

		for (int i = idx1; i <= idx2; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int[] sortArray(int[] arr, int idx1, int idx2) {
		int[] sa = new int[arr.length];

		for (int i = idx1; i <= idx2; i++) {
			sa[i] = arr[i];
		}

		Arrays.sort(sa);

		return sa;
	}

}
