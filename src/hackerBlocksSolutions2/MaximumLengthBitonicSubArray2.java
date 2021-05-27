package hackerBlocksSolutions2;

import java.util.Scanner;

public class MaximumLengthBitonicSubArray2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int tc = sc.nextInt();

		for (int t = 0; t <= tc; t++) {

			int[] arr = takeInput();
			System.out.println(maxLenBitonicSubArray(arr));

		}

	}

	// to take input.
	public static int[] takeInput() {
		int n = sc.nextInt(); // size of array

		int[] arr = new int[n]; // array

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt(); // filling array.
		}

		return arr;

	}

	public static int maxLenBitonicSubArray(int[] arr) {
		int maxLen = 0;

		int[] inc = new int[arr.length];
		int[] dec = new int[arr.length];

		// increasing.
		inc[0] = 1;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] > arr[i]) {
				// not increasing
				inc[i] = 1;
			} else if (arr[i - 1] <= arr[i]) {
				// increasing
				inc[i] = inc[i - 1] + 1;
			}
		}

		// decreasing

		dec[arr.length - 1] = 1;

		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > arr[i + 1]) {
				// decreasing
				dec[i] = dec[i + 1] + 1;
			} else {
				// not decreasing.
				dec[i - 1] = 1;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if(maxLen < (inc[i] + dec[i] - 1)) {
				maxLen = inc[i] + dec[i] - 1;
			}
		}

		return maxLen;
	}

}
