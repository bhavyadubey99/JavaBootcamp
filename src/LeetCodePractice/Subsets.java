package LeetCodePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {

		int[] nums = { 4, 4, 4, 1, 4 };
		Arrays.sort(nums);

		List<List<Integer>> list = new ArrayList<>();
//
//		subsetER(nums, 0, new ArrayList<Integer>(), list);
//
//		System.out.println(list);

		subset2ER(nums, 0, new ArrayList<Integer>(), list, false);

		System.out.println(list);

	}

	public static void subsetER(int[] arr, int vidx, List<Integer> temp, List<List<Integer>> list) {

		if (vidx == arr.length) {
			list.add(new ArrayList<>(temp));
			return;
		}

		temp.add(arr[vidx]);
		subsetER(arr, vidx + 1, temp, list);
		temp.remove(temp.size() - 1);

		subsetER(arr, vidx + 1, temp, list);

	}

	public static void subset2ER(int[] arr, int vidx, List<Integer> temp, List<List<Integer>> list, boolean flag) {
		// Element Respect

		// base case
		if (vidx == arr.length) {
			list.add(new ArrayList<>(temp));
			return;
		}

		if (vidx > 0 && arr[vidx - 1] == arr[vidx] && flag == true) {

			// only include call will be given
			temp.add(arr[vidx]);
			subset2ER(arr, vidx + 1, temp, list, true);
			temp.remove(temp.size() - 1);

		}

		else {
			// included
			temp.add(arr[vidx]);
			subset2ER(arr, vidx + 1, temp, list, true);
			temp.remove(temp.size() - 1);

			// excluded
			subset2ER(arr, vidx + 1, temp, list, false);
		}

	}

}
