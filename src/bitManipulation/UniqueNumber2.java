package bitManipulation;

public class UniqueNumber2 {

	public static void main(String[] args) {

		int[] arr = { 36, 50, 56, 56, 36, 24, 42, 50, 30 };
		int xor = 0;
		for (int val : arr) {
			xor ^= val;
		}

		// finding the right most set bit in xor.
		// making a mask, in which 1 would be there in RMSB , rest would 0.

		int mask = (xor & (-xor));

		// now to check whether the RMSB'th in values that were xor'red is one..
		// we will simply & with the values one by one..
		// if it comes out to be 0, means that value belongs to set 0.
		// else it belongs to set 1.

		int set0Xor = 0;
		int set1Xor = 0;

		for (int val : arr) {
			if ((val & mask) == 0) {
				// means it belongs to set 0.
				set0Xor ^= val;
			} else {
				// means it belongs to set1.
				set1Xor ^= val;
			}
		}

		System.out.println(set0Xor + " " + set1Xor);

	}

}
