package practiceQuestionsExtra;

import java.util.Scanner;

public class M_IncrementOperations {
	/*
	 * Question : - Consider an array of size n with all initial values as 0. We
	 * need to perform the following m range increment operations.
	 * 
	 * increment(a, b, k) : Increment values from 'a' to 'b' by 'k'. After m
	 * operations, we need to calculate the maximum of the values in the array.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] arr = new int[n + 1];

		for (int i = 0; i < m; i++) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			int k = sc.nextInt();

			arr[a] += k;
			arr[b + 1] -= k;

		}

		int existingSum = 0;

		for (int i = 0; i < n; i++) {

			arr[i] += existingSum;
			existingSum = arr[i];
		}

		int max = Integer.MIN_VALUE;

		for (int val : arr) {
			if (max < val) {
				max = val;
			}
		}

		System.out.println(max);

		sc.close();

	}

}
