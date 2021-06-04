package LeetCodePractice;

public class FindPivotIndex {

	public static void main(String[] args) {

		int[] arr = { 1, 7, 8, 4, 4 };
		System.out.println(pivotIndexApproach3(arr));

	}

	public int pivotIndexBruteForceApproach(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			int pivot = arr[i];

			int leftSum = 0;

			for (int j = 0; j < j - 1; j++) {
				// left side sum
				leftSum += arr[j];

			}

			int rightSum = 0;

			for (int j = i + 1; j < arr.length; j++) {
				// right side sum
				rightSum += arr[j];
			}

			if (rightSum == leftSum) {
				return pivot;
			}

		}

		return -1;

	}

	public static int pivotIndex(int[] arr) {

		// creating new left and right array to store sums
		int n = arr.length;
		int[] left = new int[n];
		int[] right = new int[n];

		int leftSum = 0; // leftsum as zero

		// filling vals in left array
		for (int i = 1; i < n; i++) {

			left[i] = leftSum + arr[i - 1];
			leftSum = left[i];

		}

		// O (n)

		int rightSum = 0; // rightsum as zero

		// filling vals in right array
		for (int i = n - 2; i >= 0; i--) {

			right[i] = rightSum + arr[i + 1];
			rightSum = right[i];

		}
		// O(n)

		// traversing through array if
		for (int i = 0; i < n; i++) {
			if (left[i] == right[i]) {
				return i;
			}
		}

		// O(n)

		// so whole process -> O(n)

		return -1;
	}

	public static int pivotIndexApproach3(int[] arr) {

		int leftSum = 0;
		int rightSum = 0;

		for (int i = 0; i < arr.length; i++) {
			rightSum += arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			rightSum = rightSum - arr[i];

			if (leftSum == rightSum) {
				return i;
			}
			
			leftSum = leftSum + arr[i];

		}

		return -1;
	}
}
