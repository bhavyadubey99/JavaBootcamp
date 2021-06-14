package practiceQuestionsExtra;

public class UpperAndLowerBounds {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 8, 9 };

		upperBound(arr, 2);
		lowerBound(arr, 2);
	}

	public static void upperBound(int[] arr, int val) {

		int lo = 0;
		int hi = arr.length - 1;
		int ans = -1;

		while (lo <= hi) {

			int mid = (hi + lo) / 2;

			if (arr[mid] == val) {
				// search right side, to find upper bound
				lo = mid + 1;
				ans = mid;
			} else if (arr[mid] < val) {
				// right side
				lo = mid + 1;
			} else {
				// left side.
				hi = mid - 1;
			}

		}

		System.out.println(ans);

	}

	public static void lowerBound(int[] arr, int val) {

		int lo = 0;
		int hi = arr.length - 1;
		int ans = -1;

		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (arr[mid] == val) {
				// search left for lower bound
				hi = mid - 1;
				ans = mid;
			} else if (arr[mid] < val) {
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		
		System.out.println(ans);

	}

}
