package hackerBlocksSolutions2;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumTriplets {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // size of array.
		int[] arr = new int[n];

		for (int c = 0; c < n; c++) {
			arr[c] = sc.nextInt();
		}

		int target = sc.nextInt();

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {

			for (int j = i+1; j < arr.length; j++) {

				for (int k = j+1; k < arr.length; k++) {

					if (arr[i] + arr[j] + arr[k] == target) {
						System.out.println(
								Integer.toString(arr[i]) + ", " + Integer.toString(arr[j]) + " and " +  Integer.toString(arr[k]));
					}
				}
			}
		}

	}

}
