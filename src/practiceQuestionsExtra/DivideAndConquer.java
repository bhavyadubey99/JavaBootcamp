package practiceQuestionsExtra;

public class DivideAndConquer {

	public static void main(String[] args) {

		int[] arr = { 50, 40, 60, 30, 10, 70, 90, 80, 120 };

		quickSort(arr, 0, arr.length - 1);

		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

	public static int[] mergeTwoArrays(int[] one, int[] two) {

		int[] mergedArr = new int[one.length + two.length];

		int i = 0;
		int j = 0;

		int k = 0;

		while (i < one.length && j < two.length) {

			if (one[i] < two[j]) {
				mergedArr[k] = one[i];
				i++;
				k++;
			} else {
				mergedArr[k] = two[j];
				j++;
				k++;
			}

		}

		// if one arr still has elements left
		// if it has no elements left, condition automatically violated
		while (i < one.length) {
			mergedArr[k] = one[i];
			k++;
			i++;
		}

		// if two arr still has elements left
		// if it has no elements left, condition automatically violated
		while (j < two.length) {
			mergedArr[k] = two[j];
			k++;
			j++;
		}

		return mergedArr;
	}

	public static int[] mergeSort(int[] arr, int lo, int hi) {

		// base case
		if (lo == hi) {
			// creating new array, because reference is returned.
			// if we return arr[lo] itself, then reference of arr would be returned.
			int[] br = new int[1]; // base result
			br[0] = arr[lo];
			return br;
		}

		// lo and hi are virtual indices.
		// dividing our arr.
		int mid = (lo + hi) / 2;

		int[] fh = mergeSort(arr, lo, mid); // first half
		int[] sh = mergeSort(arr, mid + 1, hi); // second half.

		// fh and sh are sorted now.
		// combining them.

		int[] merged = mergeTwoArrays(fh, sh); // returns merged sorted array.

		return merged;
	}

	public static void quickSort(int[] arr, int lo, int hi) {

		// base case
		if (lo >= hi) {
			return;
		}

		// partioning process.

		int mid = (lo + hi) / 2;

		int pivot = arr[mid];

		int left = lo;
		int right = hi;

		while (left <= right) {

			// left to point a problem
			while (arr[left] < pivot) {
				left++;
			}

			// right to point a problem
			while (arr[right] > pivot) {
				right--;
			}

			if (left <= right) {
				// now both are pointing at a problem.
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				// changes
				left++;
				right--;

			}
			


		}

		// partition process over.
		// left is to the right of right now.

		// calls to smaller problems.
		quickSort(arr, lo, right);
		quickSort(arr, left, hi);

	}
}
