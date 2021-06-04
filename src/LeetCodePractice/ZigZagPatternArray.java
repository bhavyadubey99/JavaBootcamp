package LeetCodePractice;

public class ZigZagPatternArray {

	public static void main(String[] args) {

		int[] arr = { 4, 3, 7, 8, 6, 2, 1 };

		boolean flag = true;

		for (int i = 0; i < arr.length - 1; i++) {

			if (flag) {
				if (!(arr[i] < arr[i + 1])) {
					// swap
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			} else {
				if (!(arr[i] > arr[i + 1])) {
					// swap
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}

			}
			
			flag = !flag;
		}

		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

}
