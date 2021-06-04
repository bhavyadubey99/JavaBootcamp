package LeetCodePractice;

public class firstMissingPositive {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 0}; 
		
		int r = firstMissingPositive(arr);
		System.out.println(r);
	}

	public static int firstMissingPositive(int[] arr) {

		int n = arr.length;

		// step 1 : negative values and values greater than n + 1 replaced with n + 1.
		for (int i = 0; i < n; i++) {

			if (arr[i] <= 0 || arr[i] > n + 1) {
				arr[i] = n + 1;
			}

		}

		// step 2 : Checking value, and making value at that idx negative ( idx starting
		// from 1)
		// if idx starts from 0. --> val - 1;
		for (int i = 0; i < n; i++) {

			int val = Math.abs(arr[i]) - 1; // (due to zero indexing)

			if (val == n) // to ignore n (actually -> n + 1)
				continue;

			if (arr[val] > 0) // to handle duplicates
				arr[val] = -arr[val];

		}

		// step 3: traverse array, check which value positive at which idx?
		for (int i = 0; i < n; i++) {
			if (arr[i] > 0) {
				// positive value encountered
				return i + 1;
			}
		}

		// we reach here : means 1-> n all numbers were present
		// means missing no is n +1.

		return n + 1;

	}

}
