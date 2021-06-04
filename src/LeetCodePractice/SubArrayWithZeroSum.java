package LeetCodePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SubArrayWithZeroSum {

	public static void main(String[] args) {

		int[] a = { 6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7 };

		subArray0SumSubArr(a);
	}

	public static boolean subArray0Sum(int[] arr) {

		HashSet<Integer> prefixSum = new HashSet<>();

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];

			if (prefixSum.contains(sum) || sum == 0) {
				return true;
			} else {
				prefixSum.add(sum);
			}

		}

		return false;
	}

	public static void subArray0SumSubArr(int[] arr) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		// prefix sum --> idx of arr
		// (key) --> (value)

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];

			if (map.containsKey(sum) || sum == 0) {

				if (sum == 0)
					System.out.println("0 to " + i);
				else {
					int si = map.get(sum);
					System.out.println(si + 1 + " to " + i);

				}
			} else {
				map.put(sum, i);
			}

		}

	}
}
