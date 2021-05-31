package Hashmaps;

import java.util.HashMap;

public class longestConsecutiveSequence {

	public static void main(String[] args) {

		int[] ar = { 2, 12, 9, 16, 10, 7, 5, 3, 20, 25, 11, 1, 8, 6 };
		longestConsecSeq(ar);
	}

	public static void longestConsecSeq(int[] arr) {

		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();

		for (int key : arr) {

			if (map.containsKey(key - 1)) {
				map.put(key, false);
			} else {
				map.put(key, true);
			}

			if (map.containsKey(key + 1)) {
				map.put(key + 1, false);
			}
		}

		int max = 0;
		int startingPoint = 0;

		for (int key : map.keySet()) {

			if (map.get(key)) {

				int count = 0;
				while (map.containsKey(key + count)) {
					count++;
				}

				if (max < count) {
					max = count;
					startingPoint = key;
				}
			}
		}

		for (int i = 0; i < max; i++) {
			System.out.print(startingPoint + i + " ");
		}

	}

}
