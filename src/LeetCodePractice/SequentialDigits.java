package LeetCodePractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SequentialDigits {

	public static void main(String[] args) {

		System.out.println(sequentialDigits(1000, 13000));

	}

	public static List<Integer> sequentialDigits(int low, int high) {

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i < 10; i++) {

			sequentialDigits(i, low, high, list);

		}
		
		Collections.sort(list);

		return list;

	}

	public static void sequentialDigits(int curr, int low, int high, List<Integer> list) {

		if (curr > high) {
			return;
		}

		if (curr > low && curr < high) {
//			System.out.println(curr);
			list.add(curr);
			// not returning, as more answers might be there.
		}

		int ld = curr % 10; // last digit of current.

		if (ld != 9) {
			sequentialDigits(curr * 10 + (ld + 1), low, high, list);
		}

	}

}
