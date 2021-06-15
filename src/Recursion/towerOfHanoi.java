package Recursion;

public class towerOfHanoi {

	public static void main(String[] args) {

		towerOfHanoiProblem(3, "src", "dest", "helper");

	}

	public static void towerOfHanoiProblem(int n, String src, String dest, String helper) {
		// n -> no of discs.

		// base case
		if (n == 0) {
			return;
		}

		// Step 1 : move n - 1 discs from src to helper with dest as helper.
		towerOfHanoiProblem(n - 1, src, helper, dest);

		// Step 2 : move nth leftover disc from src to dest, with helper as helper.
		if (n == 1) {
			System.out.println("Move 1st disc from " + src + " to " + dest);
		} else if (n == 2) {
			System.out.println("Move 2nd disc from " + src + " to " + dest);
		} else {
			System.out.println("Move " + n + "st disc from " + src + " to " + dest);
		}

		// Step 3 : move n -1 discs from helper to dest with src as helper.
		towerOfHanoiProblem(n - 1, helper, dest, src);

	}

}
