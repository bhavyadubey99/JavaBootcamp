package hackerBlocksSolutions2;

import java.util.Scanner;

public class waterTrapping {
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		int tc = sc.nextInt();

		for (int t = 1; t <= tc; t++) {
			int[] arr = takeInput();
			System.out.println(trap(arr));
		}

	}

	public static int[] takeInput() {
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		return arr;
		

	}

	public static int trap(int[] height) {
		int res = 0;
		if (height.length == 0 || height == null) {
			return 0;
		}

		int level = 0;
		int left = 0;
		int lower;
		int right = height.length - 1;

		while (left < right) {
			if (height[left] < height[right]) {
				lower = height[left++];
			} else {
				lower = height[right--];
			}

			level = Math.max(level, lower);

			res += level - lower;
		}

		return res;
	}
}
