package LeetCodePractice;

import java.util.Arrays;

public class MagneticForceBetweenTwoBalls {

	public static void main(String[] args) {
		 int[] a= {79,74,57,22};
		//int[] a = { 2, 8, 10 };
		int res = maxDistance(a, 4);

		System.out.println(res);

	}

	public static int maxDistance(int[] position, int m) {

		Arrays.sort(position);

		int lo = 0; // min force
		int hi = position[position.length - 1] - position[0]; // max force

		int ans = 0;

		while (lo <= hi) {
			int mid = (lo + hi) / 2;

			// mid is the min magnetic force.

			if (canPlaceMagnet(position, m, mid)) {
				// move right
				lo = mid + 1;
				ans = mid;
			} else {
				hi = mid - 1;
			}
		}

		return ans;

	}

	public static boolean canPlaceMagnet(int[] position, int m, int mid) {
		int magnetsPlaced = 1;
		int lastPos = position[0];

		for (int i = 0; i < position.length; i++) {
			if (position[i] - lastPos >= mid) {
				magnetsPlaced++;
				lastPos = position[i];

				if (magnetsPlaced == m) {
					return true;
				}
			}
		}

		return false;

	}

}
