package sortingAlgorithms;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = { 44, 55, 22, 11, 50, 60 };

		for (int counter = 0; counter < arr.length - 1; counter++) {

			// here, counter indicates the array being considered..
			// counter to end of arr, we try to sort array.
			// this means arr is sorted in the start.

			int min = counter;

			for (int i = counter; i < arr.length; i++) {

				if (arr[min] > arr[i]) {
					min = i;
				}

			}

			// we have the min value in array from counter idx to end.

			// swap counter and min

			int temp = arr[counter];
			arr[counter] = arr[min];
			arr[min] = temp;

		}

		for (int val : arr) {
			System.out.println(val);
		}
	}

}
