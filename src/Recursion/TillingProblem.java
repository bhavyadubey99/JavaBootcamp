package Recursion;

public class TillingProblem {
	
	static int mod = 1000_000_007;

	public static void main(String[] args) {

		int a = waysToTile(7,4);

		System.out.println(a);

	}

	public static int waysToTile(int n, int m) {

		// n * m is to be tiled
		// if we place m * 1 tile vertically -> left over space = m * (n -1) -> as n - 1
		// length is left.

		// if we place m * 1 tile horizontally -> left over space = m * (n - m) -> as ..
		// in the leftover space above the horizontally placed tile, no tile can be
		// placed vertically.
		// tiles are m * 1. min m height spaces is needed to place it vertically but we
		// have m - 1 space left.
		// so there is only one way,
		// the rest of the leftover space has length of n -m and width of m
		// so m * (n- m).

		if (n == 1 || n == 0) {
			return n;
		}
		
		if(n < m) {
			return 1;
		}
		
		if(n == m) {
			return 2;
		}

		// horizontally
		int hor = (waysToTile(m, n - m)) % mod;

		// vertically
		int ver = (waysToTile(m, n - 1)) % mod;

		if (n < m) {
			return hor;
		}

		return ver + hor;

	}

}
