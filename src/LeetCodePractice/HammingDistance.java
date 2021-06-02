package LeetCodePractice;

public class HammingDistance {

	public static void main(String[] args) {
		System.out.println(hammingDistance(6, 4));
	}

	public static int hammingDistance(int x, int y) {

		// finding bitwise XOR of both the numbers

		int xor = x ^ y;

		// then counting the no. of set bits.
		int count = 0;
		while (xor != 0) {

			if ((xor & 1) == 1) {
				// means in xor, the 0th bit was 1.
				count++;
			}

			xor >>= 1; // right shift by one, to bring 1st to 0th, 2nd to 1st and so on.

		}

		return count;

	}

}
