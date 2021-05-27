package LeetCodePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {

	public static void main(String[] args) {

//		System.out.println(permute(new int[] { 1, 1, 3 }));

		System.out.println(getPermutation(4, 9));
	}

	public static List<List<Integer>> permute(int[] nums) {

		List<List<Integer>> list = new ArrayList<List<Integer>>();

		boolean[] avl = new boolean[nums.length];

		Arrays.fill(avl, true);

//			for(int i = 0; i < avl.length; i++) {
//				avl[i] = true;
//			}

		permutation2(nums, avl, new ArrayList<Integer>(), list);

		return list;

	}

	public static void permutation(int[] arr, boolean[] availability, List<Integer> temp, List<List<Integer>> list) {

		if (temp.size() == arr.length) {
			list.add(new ArrayList<>(temp));
			return;
		}

		for (int i = 0; i < arr.length; i++) {

			if (availability[i]) {

				availability[i] = false; // prep
				temp.add(arr[i]);
				permutation(arr, availability, temp, list); // call
				temp.remove(temp.size() - 1);
				availability[i] = true; // undo

			}
		}
	}

	public static void permutation2(int[] arr, boolean[] availability, List<Integer> temp, List<List<Integer>> list) {

		if (temp.size() == arr.length) {
			list.add(new ArrayList<>(temp));
			return;
		}

		for (int i = 0; i < arr.length; i++) {

			if (i > 0 && arr[i] == arr[i - 1] && availability[i - 1] == true) {
				continue;
			}

			if (availability[i]) {

				availability[i] = false; // prep
				temp.add(arr[i]);
				permutation2(arr, availability, temp, list); // call
				temp.remove(temp.size() - 1);
				availability[i] = true; // undo

			}
		}
	}

	public static String getPermutation(int n, int k) {

		// creating an array of factorial such that, ith index has ith factorial value.

		int[] fact = new int[n];
		fact[0] = 1;
		for (int i = 1; i < fact.length; i++) {
			fact[i] = fact[i - 1] * i;
		}

		// preparing an array list, ith index has i value
		ArrayList<Integer> arrlist = new ArrayList<Integer>();

		for (int i = 0; i <= n; i++) {
			arrlist.add(i);
		}

		// calling function.

		String ans = permutationSequence(n, k, fact, arrlist, "");
		return ans;

	}

	public static String permutationSequence(int n, int k, int[] fact, ArrayList<Integer> arrlist, String ans) {

		// BP : n value -> kth perm

		// base case
		if (n == 0) {
			return ans;
		}

		// identifying the group.
		int group = k / fact[n - 1];

		if (k % fact[n - 1] != 0)
			group++;

		int newk = k - ((group - 1) * fact[n - 1]);

		// we now know what our new k will be.

		// now removing the group no from arrlist, as we have already used that no in
		// our ans

		int val = arrlist.remove(group);

		return permutationSequence(n - 1, newk, fact, arrlist, ans + val);

	}
}
