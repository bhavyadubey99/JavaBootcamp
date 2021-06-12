package sortingAlgorithms;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 44, 22, 11, 88, 66, 99 };

		for (int counter = 0; counter < arr.length - 1; counter++) {

			// counter indicates that counter no. of elements are already sorted...
			// means elements at the end of the array get sorted.

			for (int j = 0; j < arr.length - counter - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int val : arr) {
			System.out.println(val);
		}

	}

}
