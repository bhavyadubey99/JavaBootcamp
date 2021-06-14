package sortingAlgorithms;

public class InsertionSort {

	// works such that we want to insert an element in an already sorted array.

	public static void main(String[] args) {
		int[] arr = { 88, 11, 44, 99, 33 };

		int counter = 1; // signifies that array till counter idx is sorted.
		// no point for counter = 0 --> 1 element is already sorted.

		for (; counter <= arr.length - 1; counter++) {

			int val = arr[counter];

			int j = counter - 1;

			while (j >= 0 && arr[j] > val) {

				arr[j + 1] = arr[j];

				j--;
			}

			arr[j + 1] = val;

		}

		for (int val : arr) {
			System.out.print(val + " ");
		}

	}

}
