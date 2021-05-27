package practiceQuestionsExtra;

import java.util.Scanner;

public class ArrayOps {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		int[] myArr = { 1, 0, 3, 4 };
		int[] myArr = { 0, 1, 0, 2, 0, 4 };

		waterTrappingDraw(myArr);

		System.out.println(trap(myArr));
	}
	
	public static int trap(int[] height) {
		int res = 0; 
		if(height.length == 0 || height == null) {
			return 0; 
		}
		
		int level = 0; 
		int left = 0; 
		int lower;
		int right = height.length - 1;
		
		while(left < right) {
			if(height[left] < height[right]) {
				lower = height[left++];
			}
			else {
				lower = height[right--];
			}
			
			
			level = Math.max(level, lower);
			
			res += level - lower;
		}
		
		return res; 
	}

	public static void takeInput() {
		System.out.println("Size?");
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

	}

	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

	public static int linearsearch(int[] arr, int item) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			}
		}
		return -1;
	}

	public static int binarysearch(int[] arr, int item) {

		int lo = 0;
		int hi = arr.length - 1;

		while (lo <= hi) {
			int mid = (lo + hi) / 2;

			if (arr[mid] == item) {
				return mid;
			} else if (arr[mid] > item) {
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}

		}
		return -1;

	}

	public static void reverse(int[] arr) {

		for (int i = 0; i < (arr.length / 2); i++) {

			int temp = arr[i];
			arr[i] = arr[(arr.length - 1 - i)];
			arr[(arr.length - 1 - i)] = temp;
		}
	}

	public static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start = start + 1;
			end = end - 1;
		}
	}

	public static int maximum(int[] arr) {

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max)
				max = arr[i];

		}

		return max;

	}

	public static void barGraph(int[] arr) {

		int rows = maximum(arr);
		int cols = arr.length;

		for (int r = 1; r <= rows; r++) {

			for (int c = 0; c < cols; c++) {

				if (r <= rows - arr[c])
					System.out.print("  ");
				else
					System.out.print("* ");
			}

			System.out.println();
		}

	}

	public static int minimum(int[] arr) {
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static void waterTrappingDraw(int[] arr) {

		int rows = maximum(arr);
		int waterTrapping = 0;
		int cols = arr.length;

		int minHeight = Math.min(arr[0], arr[arr.length - 1]);

		if (minHeight == 0) {
			minHeight = minimum(arr);
		}

		for (int r = 1; r <= rows; r++) {

			for (int c = 0; c < cols; c++) {

				if (r > (rows - minHeight) && r <= rows - arr[c]) {
					System.out.print("~ ");
					waterTrapping++;
				} 
				else if (r <= rows - arr[c])
					System.out.print("  ");
				else
					System.out.print("* ");
			}

			System.out.println();
		}
		System.out.println(waterTrapping);
	}

	public static int waterTrapping(int[] arr) {
		int trappedWater = 0;

		int rows = maximum(arr);
		int cols = arr.length;

		// logic.
		for (int i = 1; i < arr.length - 1; i++) {

			if (arr[i - 1] > arr[i] && arr[i + 1] >= arr[i - 1]) {
				trappedWater += arr[i - 1] - arr[i];
			}

		}

		return trappedWater;
	}

	public static void rotate(int[] arr, int rot) {

		rot = rot % arr.length;

		for (int j = 1; j <= rot; j++) {
			// single rotation
			int temp = arr[arr.length - 1];

			for (int i = arr.length - 1; i >= 1; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = temp;
		}
	}

	public static void rotate2(int[] arr, int rot) {

		reverse(arr, (arr.length - 1 - rot), (arr.length - 1));
		reverse(arr, 0, (arr.length - rot));

		reverse(arr);

	}

	public static int[] inverse(int[] arr) {

		int[] res = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			res[arr[i]] = i;
		}

		return res;
	}

	public static void subArrayPrint(int[] arr) {

		for (int si = 0; si < arr.length; si++) {
			for (int ei = si; ei < arr.length; ei++) {
				for (int k = si; k <= ei; k++) {
					System.out.print(arr[k] + " ");
				}

				System.out.println();
			}
		}
	}

	public static void subArraysum3loops(int[] arr) {

		for (int si = 0; si < arr.length; si++) {
			for (int ei = si; ei < arr.length; ei++) {
				int sum = 0;

				for (int k = si; k <= ei; k++) {
					sum += arr[k];
				}

				System.out.print(sum + " ");
			}
			System.out.println();
		}
	}

	public static void subArraysum2loops(int[] arr) {
		for (int si = 0; si < arr.length; si++) {
			int sum = 0;
			for (int ei = si; ei < arr.length; ei++) {
				sum += arr[ei];
				System.out.print(sum + " ");
			}

			System.out.println();
		}

	}

	public static void maxSubArraySum2loops(int[] arr) {

		int max = Integer.MIN_VALUE;

		for (int si = 0; si < arr.length; si++) {
			int sum = 0;
			for (int ei = si; ei < arr.length; ei++) {
				sum += arr[ei];

			}

			if (sum > max) {
				max = sum;
			}

		}

		System.out.println(max);
	}

	public static int kadane(int[] arr) {

		int[] start = new int[arr.length];
		start[0] = 0;

		int ei = 0;

		int sum = arr[0];
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			sum = sum + arr[i];

			if (arr[i] > sum) {
				sum = arr[i];
				start[i] = i;
			} else {
				start[i] = start[i - 1];
			}

			if (sum > max) {
				max = sum;
				ei = i;
			}

		}
		for (int i = start[ei]; i <= ei; i++) {
			// System.out.print(arr[i] + " ");
		}
		// System.out.println();
		return max;
	}

	public static int circularArrayMaxSumArraySum(int[] arr) {

		// Case 1 ---> Contributing Elements are non-wrapping.
		// Simply call kadane.

		int CENonWrapping = kadane(arr);

		// Case 2 ---> Contributing Elements are wrapping.
		// Invert signs and then call kadane.

		int totalSum = 0;

		// inverting signs.
		for (int i = 0; i < arr.length; i++) {
			totalSum += arr[i];
			arr[i] = -arr[i];
		}

		// applying kadane.
		int NonContributingElementsSum = kadane(arr);

		int CEWrapping = totalSum + NonContributingElementsSum;

		return Math.max(CEWrapping, CENonWrapping);

	}

}
