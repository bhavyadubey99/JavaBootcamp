package hackerBlocksSolutions2;

import java.util.Scanner;

public class MaximumSumPath {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tc = 1;

		for (int t = 1; t <= tc; t++) {

			int n = 8;
			int m = 8;

			int[] arr1 = {2 ,3, 7, 10, 12, 15, 30, 34};
			int[] arr2 = {1 ,5 ,7 ,8 ,10 ,15 ,16 ,19};

//			for (int i = 0; i < n; i++) {
//				arr1[i] = sc.nextInt();
//			}
//
//			for (int i = 0; i < m; i++) {
//				arr2[i] = sc.nextInt();
//			}

			int sum1 = 0;
			int sum2 = 0;

			int sum = 0;

			int i = 0;
			int j = 0;

			while (i < m && j < n) {
				if (arr1[i] < arr2[j]) {
					sum1 += arr1[i];
					i++;

				} else if (arr2[j] < arr1[i]) {
					sum2 += arr2[j];
					j++;
				}

				else {
					sum += Math.max(sum1, sum2);
					sum1 = 0;
					sum2 = 0;
					i++;
					j++;
				}
			}

			System.out.println(sum);

		}
	}

}
