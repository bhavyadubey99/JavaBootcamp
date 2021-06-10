package LeetCodePractice;

import java.util.HashMap;
import java.util.HashSet;

public class kDiffPairs {

	public static void main(String[] args) {
		int[] a = { 3, 1, 4, 1, 5 };

		System.out.println(findPairs(a, 2));

	}

	public static int findPairs(int[] nums, int k) {

		// find pair in array such that their diff is k .
		if (k < 0)
			return 0;

		// create frequency map.
		int count = 0;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int val : nums) {
			if (map.containsKey(val)) {
				map.put(val, map.get(val) + 1);
			} else {
				map.put(val, 1);
			}
		}

		for (int key : map.keySet()) {
			if (k == 0) {
				if (map.get(key) >= 2) {
					count++;
				}
			} else if (map.containsKey(key + k)) {
				count++;
			}
		}

		return count;

	}

}
