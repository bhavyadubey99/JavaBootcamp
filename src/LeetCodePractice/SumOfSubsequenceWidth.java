package LeetCodePractice;

import java.util.Arrays;

public class SumOfSubsequenceWidth {

	public static void main(String[] args) {

		int[] ar = { 1, 2,3}; 
		int r = sumSubseqWidths(ar); 
		System.out.println(r);
	}

	public static int sumSubseqWidths(int[] nums) {

		int mod = 1000_000_007; // for mod

		Arrays.sort(nums); // sorting array

		// to keep track of powers of two.
		long[] powersOfTwo = new long[nums.length];

		powersOfTwo[0] = 1;

		for (int i = 1; i < nums.length; i++) {
			powersOfTwo[i] = (powersOfTwo[i - 1] * 2) % mod;
		}

		// finding contribution of each element in max and min.
		long max = 0;
		long min = 0;
		for (int i = 0; i < nums.length; i++) {

			// contribution in max
			max = (max + nums[i] * powersOfTwo[i]) % mod; // eg : 3 * 2 ^ 2

			// contribution in min
			min = (min + nums[i] * powersOfTwo[nums.length - i - 1]) % mod;

		}

		int res = (int) (max - min) % mod;

		return res;

	}

}
