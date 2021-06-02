package LeetCodePractice;

public class KConcatenationMaximumSum {

	public static void main(String[] args) {

		int[] arr = { -1, -2, -1 };
		long res = kConcatenationMaxSum(arr, 3);

		System.out.println(res);

	}

	public static int kConcatenationMaxSum(int[] arr, int k) {

		if (k == 1) {
			return Kadane(arr);
		}

		int mod = 1000000007;

		// finding the sum of the array elements.

		long sumOfArr = 0;

		for (int i = 0; i < arr.length; i++) {
			sumOfArr += arr[i];
		}

		if (sumOfArr < 0) {
			// sum comes out to be negative : case 2
			return Kadane2Repeat(arr);
		}

		else {
			// sum is positive: case 3
			return (int) (Kadane2Repeat(arr) + ((k - 2) * sumOfArr) % mod);
		}

	}

	public static int Kadane(int[] arr) {
		// to find max sub array sum.

		int sum = arr[0];
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {

			sum = Math.max(arr[i], sum + arr[i]);

			if (sum > max) {
				max = sum;
			}

		}

		if (max < 0)
			max = 0;

		return max;
	}

	public static int Kadane2Repeat(int[] arr) {
		int[] na = new int[arr.length * 2]; // new array

		for (int i = 0; i < arr.length; i++) {

			na[i] = arr[i];
			na[arr.length + i] = arr[i];

		}

		return Kadane(na);
	}

}
