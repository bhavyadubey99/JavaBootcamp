package LeetCodePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {

		List<Integer> temp = new ArrayList<>();
		List<List<Integer>> list = new ArrayList<>();
		
		combinationSum3CR(1, 9, 3, temp, list);
		
		System.out.println(list);
		



	}

	public static void combinationSumUR(int[] denom, int amt, int vidx, List<Integer> temp, List<List<Integer>> list) {

		// case 1 : User Respect.

		// base cases
		if (amt == 0) {
			// adding the items in temp to list.
			// but making it a new list to a new address with contents of temp.
			list.add(new ArrayList<Integer>(temp));
			return;
		}

		if (amt < 0 || vidx == denom.length) {
			return;
		}

		// user respect
		for (int i = vidx; i < denom.length; i++) {

			// prepare
			temp.add(denom[i]);

			// call
			combinationSumUR(denom, amt - denom[i], i, temp, list);

			// undo
			temp.remove(temp.size() - 1); // removes last element.

		}

	}

	public static void combinationSumCR(int[] denom, int amt, int vidx, List<Integer> temp, List<List<Integer>> list) {

		// coin respect.

		// base case
		if (amt == 0) {
			list.add(new ArrayList<Integer>(temp));
			return;
		}

		if (amt < 0 || vidx == denom.length) {
			return;
		}

		// the denomination participates
		temp.add(denom[vidx]); // prep
		combinationSumCR(denom, amt - denom[vidx], vidx, temp, list); // call
		temp.remove(temp.size() - 1); // undo

		// doesn't participate
		combinationSumCR(denom, amt, vidx + 1, temp, list);

	}

	public static void combinationSum2UR(int[] denom, int amt, int vidx, List<Integer> temp, List<List<Integer>> list) {

		// case 3

		if (amt == 0) {
			list.add(new ArrayList<Integer>(temp));
			return;
		}
		if (amt < 0) {
			return;
		}

		// user respect

		for (int i = vidx; i < denom.length; i++) {

			if (i > vidx && denom[i - 1] == denom[i]) {
				continue;
			}

			temp.add(denom[i]);
			combinationSum2UR(denom, amt - denom[i], i + 1, temp, list);
			temp.remove(temp.size() - 1);
		}
	}

	public static void combinationSum2CR(int[] denom, int amt, int vidx, List<Integer> temp, List<List<Integer>> list,
			boolean flag) {

		// case 3

		/// base case
		if (amt == 0) {
			list.add(new ArrayList<Integer>(temp));
			return;
		}
		if (amt < 0 || vidx == denom.length) {
			return;
		}

		if (flag == false && denom[vidx] == denom[vidx - 1]) {

			// exclude call only
			combinationSum2CR(denom, amt, vidx + 1, temp, list, false);

		} else {
			// both include and exclude calls.

			// include.
			temp.add(denom[vidx]);
			combinationSum2CR(denom, amt - denom[vidx], vidx + 1, temp, list, true);
			temp.remove(temp.size() - 1);

			// exclude
			combinationSum2CR(denom, amt, vidx + 1, temp, list, false);

		}

	}

	public static void combinationUR(int[] numbers, int k, int vidx, List<Integer> temp, List<List<Integer>> list) {

		// User Respect

		// base case
		if (k == 0) {
			list.add(new ArrayList<Integer>(temp));
			return;
		}

		if (vidx == numbers.length) {
			return;
		}

		for (int i = vidx; i < numbers.length; i++) {

			// user chooses numbers[i]
			temp.add(numbers[i]);
			combinationUR(numbers, k - 1, i + 1, temp, list);
			temp.remove(temp.size() - 1);

		}
	}

	public static void combinationCR(int start, int n, int k, List<Integer> temp, List<List<Integer>> list) {
		
		//base case
		if(k == 0) {
			list.add(new ArrayList<Integer>(temp));
			return;
		}
		
		if(start > n) {
			return;
		}
		
		//coin respect
		
		//included.
		temp.add(start);
		combinationCR(start + 1, n, k - 1, temp, list);
		temp.remove(temp.size() - 1);
		
		//excluded
		combinationCR(start + 1, n, k, temp,list);
	}

	public static void combinationSum3UR(int start, int n, int k, List<Integer> temp, List<List<Integer>> list) {
		//User Respect
		
		//base cases
		if(n == 0 && k == 0) {
			list.add(new ArrayList<>(temp));
			return;
		}
		
		if(start > 9 || n < 0) {
			return;
		}
		
		for(int i = start; i < 10; i++) {
			temp.add(i);
			combinationSum3UR(i + 1, n - i, k - 1, temp, list);
			temp.remove(temp.size() - 1);
			
		}
	}

	public static void combinationSum3CR(int start, int n, int k, List<Integer> temp, List<List<Integer>> list) {
		//Coin Respect
		
		//base case
		if(n == 0 && k == 0) {
			list.add(new ArrayList<>(temp));
			return;
		}
		
		if(n < 0 || start > 9) {
			return;
		}
		
		//include
		temp.add(start);
		combinationSum3CR(start + 1, n - start, k - 1, temp, list);
		temp.remove(temp.size() - 1);
		
		//exclude
		combinationSum3CR(start + 1, n, k, temp,list);
		
	}
	
}
