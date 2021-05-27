package hackerBlocksSolutions2;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}

		int m = sc.nextInt();
		System.out.println(binarySearch(arr, m));

	}

	public static int binarySearch(int[] arr, int item) {
		int hi = arr.length - 1;
		int lo = 0;

		int mid = (hi + lo) / 2;

		while (hi > lo) {
			if (arr[mid] == item) {
				return mid;
			} else if (item > arr[mid]) {
				// move to right
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}

		return -1;
	}

}
