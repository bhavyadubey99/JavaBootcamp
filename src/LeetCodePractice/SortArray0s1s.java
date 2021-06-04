package LeetCodePractice;

public class SortArray0s1s {

	public static void main(String[] args) {

		int[] arr = { 0, 0, 2,  1, 1, 1, 2 };
		
		Approach2(arr);

	}

	public static void Approach1(int[] arr) {
		int c0 = 0;
		int c1 = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0)
				c0++;
			if (arr[i] == 1)
				c1++;

		}

		for (int i = 0; i < arr.length; i++) {
			if (c0 > 0) {
				arr[i] = 0;
				c0--;
			} else if (c1 > 0) {
				arr[i] = 1;
				c1--;
			} else {
				arr[i] = 2;
			}
		}

		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

	public static void Approach2(int[] arr) {

		int hi = arr.length - 1;
		int mid = 0;
		int lo = 0;

		while (mid < hi) {

			if (arr[mid] == 0) {
				// swap with lo
				int temp = arr[lo];
				arr[lo] = arr[mid];
				arr[mid] = temp;

				mid++;
				lo++;
			} else if (arr[mid] == 1) {
				mid++;
			} else {
				// arr[mid] == 2
				// swap with hi
				int temp = arr[hi];
				arr[hi] = arr[mid];
				arr[mid] = temp;

				hi--;
			}

		}

		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

}
