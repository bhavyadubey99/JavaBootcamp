package practiceQuestionsExtra;

import java.util.Scanner;

public class longestBitonicSubsequence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();

		for (int t = 1; t <= tc; t++) {

			int n = sc.nextInt();

			int[] arr = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			System.out.println(subseq(arr));

		}

	}

	public static int subseq(int[] arr) {

		int n = arr.length;

		// increasing subsequence

		int[] dpinc = new int[n];

		for (int i = 0; i < n; i++) {

			int max = 0;

			for (int j = 0; j < i; j++) {

				if (arr[j] <= arr[i] && dpinc[j] > max) {
					max = dpinc[j];
				}

			}

			dpinc[i] = max + 1;

		}
		
		System.out.println("inc");
		
		for(int val : dpinc) {
			System.out.print(val + " ");
		}

		// decreasing subsequence
		int[] dpdec = new int[n];

		for (int i = n - 1; i >= 0; i--) {

			int max = 0;

			for (int j = n - 1; j > i; j--) {

				if (arr[j] <= arr[i] && dpdec[j] > max) {
					max = dpdec[j];
				}

			}

			dpdec[i] = max + 1;
		}
		
		System.out.println("dec");
		
		for(int val : dpdec) {
			System.out.print(val + " ");
		}

		// overall subsequence
		int[] dp = new int[n];

		int finalMax = 0;

		for (int i = 0; i < n; i++) {

			dp[i] = dpinc[i] + dpdec[i] - 1;

			if (dp[i] > finalMax) {
				finalMax = dp[i];
			}

		}
		
		System.out.println("\nOverall");
		
		for(int val : dp) {
			System.out.print(val + " ");
		}

		return finalMax;

	}

}
