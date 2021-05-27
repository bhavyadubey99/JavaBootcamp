package hackerBlocksSolutions2;

import java.util.Scanner;

public class MaximumLengthBitonicSubArray {
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

	// to make a sub array.
	public static int[] makeSubArr(int[] arr, int i, int j) {
		int lenOfArr = j - i + 1;
		int[] subArr = new int[lenOfArr];
		int k = i;

		for (int idx = 0; idx < subArr.length; idx++) {
			subArr[idx] = arr[k];
			k++;
		}

		return subArr;
	}

	// to see if whole sub array is increasing
	public static boolean isIncreasing(int[] subArr) {
		boolean inc = true;

		for (int i = 1; i < subArr.length; i++) {
			if (subArr[i - 1] > subArr[i]) {
				inc = false;
				break;
			}
		}

		return inc;
	}

	// to see if whole sub array is decreasing.
	public static boolean isDecreasing(int[] subArr) {
		boolean dec = true;

		for (int i = 1; i < subArr.length; i++) {
			if (subArr[i - 1] < subArr[i]) {
				dec = false;
				break;
			}
		}

		return dec;
	}

	// to see if increasing first and then decreasing.
	public static boolean isIncDec(int[] subArr) {
		boolean incdec = true;
		boolean ds = false; // means decreasing portion has started.Initially, elements would increase, so
							// set this to false.

		for (int i = 1; i < subArr.length; i++) {
			if (subArr[i - 1] < subArr[i] && !(ds)) {
				// increasing peacefully, decreasing portion has not yet started.
				continue;
			} else if (subArr[i - 1] > subArr[i] && !(ds)) {
				// decreasing pattern is observed, but not declared that decreasing portion has
				// started.
				// means that decrease has started for the first time.
				ds = true;
				continue;
			} else if (subArr[i - 1] < subArr[i] && (ds)) {
				// decreasing portion has started long ago, but hey! elements are increasing.
				// means this is breaking the rule.
				// inc ^^ then dec __ but then again inc ^^ , wrong!
				incdec = false;
				break;
			}

		}

		return incdec;
	}

	// to find max length bitonic sub array.
	public static int maxLenBitonicSubArray(int[] arr) {
		int maxLen = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				int[] subArr = makeSubArr(arr, i, j); // creating sub array.

				// checking if fully increasing or decreasing.
				if (isIncreasing(subArr) || isDecreasing(subArr)) {
					if (maxLen < subArr.length) {
						maxLen = subArr.length;
					}
				}
				// checking if increasing first then decreasing
				else if (isIncDec(subArr)) {
					if (maxLen < subArr.length) {
						maxLen = subArr.length;
					}
				}
			}
		}

		return maxLen;
	}

}
