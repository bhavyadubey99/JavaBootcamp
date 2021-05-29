package bitManipulation;

public class MissingNumber2 {

	public static void main(String[] args) {

		int[] arr = { 3, 4, 2, 6 };

		int n = 6;

		// xorring values in arr.
		int xor = 0;
		for (int val : arr) {
			xor ^= val;
		}

		// xorring it with values from 1 to n
		for (int i = 1; i <= n; i++) {
			xor ^= i;
		}

		// in xor we get the ^ of two missing numbers. Finding those numbers separately.

		// finding Right most set bit in xor and making a mask.
		int mask = (xor & (-xor));

		// &-ing mask with every value of xor product.
		// checking which is part of set 0 and set 1.

		int set0Xor = 0;
		int set1Xor = 0;

		// for 1 to n
		for (int i = 1; i <= n; i++) {
			if ((mask & i) == 0) {
				// bit is 0
				set0Xor ^= i;
			} else {
				// bit is 1
				set1Xor ^= i;
			}
		}

		// for array values.
		for (int val : arr) {
			if ((mask & val) == 0) {
				// bit is 0
				set0Xor ^= val;
			} else {
				// bit is 1
				set1Xor ^= val;
			}
		}

		System.out.println(set0Xor + " " + set1Xor);

	}

}
