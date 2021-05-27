package hackerBlocksSolutions2;

import java.util.Scanner;

public class MaximumSumPath2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();

		for (int t = 1; t <= tc; t++) {

			int m = sc.nextInt();
			int n = sc.nextInt();

			int[] arr1 = new int[m];
			int[] arr2 = new int[n];

			for (int i = 0; i < m; i++) {
				arr1[i] = sc.nextInt();
			}

			for (int i = 0; i < n; i++) {
				arr2[i] = sc.nextInt();
			}

			System.out.println(maxSumPath(arr1, arr2));

		}
	}

	public static int maxSumPath(int[] one, int[] two) {
		int sum = 0;

		int m = one.length;
		int n = two.length;

		int i = 0;
		int j = 0;

		int sum1 = 0;
		int sum2 = 0;

		int cei1 = 0; // common element index for first array.
		int cei2 = 0; // common elements index for second array.

		// logic

		while (i < m && j < n) {

			if (one[i] == two[j]) {
				// we have got common elements now.
				int greaterSum = Math.max(sum1, sum2);
				sum += greaterSum + one[i];
				i++;
				j++;
				sum1 = 0;
				sum2 = 0;
				cei1 = i;
				cei2 = j;

			} else if (one[i] < two[j]) {
				// add that to the sum1 also.
				sum1 += one[i];
				i++;
			} else {
				// add that to sum2 also.
				sum2 += two[j];
				j++;
			}
		}

		// till the end. (after the last common element).
		// last common elements' indices in each array stored in cei1 and cei2.
		sum1 = 0;
		sum2 = 0;

		for (int idx = cei1; idx < one.length; idx++) {
			sum1 += one[idx];
		}

		for (int idx = cei2; idx < two.length; idx++) {
			sum2 += two[idx];
		}

		sum += Math.max(sum1, sum2);
		return sum;
	}

}
