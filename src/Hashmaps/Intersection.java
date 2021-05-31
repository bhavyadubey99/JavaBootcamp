package Hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class Intersection {

	public static void main(String[] args) {

		int[] one = { 10, 20, 50, 5, 60, 20, 50, 50, 3, 50, 10 };
		int[] two = { 2, 10, 70, 10, 80, 5, 50, 3, 1, 3, 50 };

		HashMap<Integer, Integer> freqMap = new HashMap<>();

		ArrayList<Integer> res = new ArrayList<>();

		// creating a frequency map for first array.
		for (int i = 0; i < one.length; i++) {

			int nf = freqMap.getOrDefault(one[i], 0) + 1;

			freqMap.put(one[i], nf);
		}

		// traversing through second array to see if any element matches.
		for (int i = 0; i < two.length; i++) {

			if (freqMap.containsKey(two[i]) && freqMap.get(two[i]) > 0) { // frequency map contains the element as key.

				res.add(two[i]); // adding the key to result, as a match is found, means it is an intersection .
				freqMap.put(two[i], freqMap.get(two[i]) - 1); // updating the frequency by reducing it by one, as it has
																// been consumed.
			}
		}

		// displaying the result.
		System.out.println(res);

	}

}
