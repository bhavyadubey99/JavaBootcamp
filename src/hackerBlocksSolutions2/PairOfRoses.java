package hackerBlocksSolutions2;

import java.util.Arrays;
import java.util.Scanner;

public class PairOfRoses {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int testcases = sc.nextInt();

		for (int c = 1; c <= testcases; c++) {
			int nr = sc.nextInt();

			int[] arr = new int[nr];

			for (int i = 0; i < nr; i++) {
				arr[i] = sc.nextInt();
			}

			int money = sc.nextInt();

			buyRoses(arr, money);
			System.out.println();
		}
	}

	public static void buyRoses(int[] arr, int money) {

		Arrays.sort(arr);

		int[] myArr = new int[2];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == money) {
					if (myArr[0] == 0 && myArr[1] == 0) {
						myArr[0] = arr[i];
						myArr[1] = arr[j];
					}
					else if ((arr[j] - arr[i]) < (myArr[1] - myArr[0])) {
						myArr[0] = arr[i];
						myArr[1] = arr[j];
					}
				}
			}

		}

		System.out.println("Deepak should buy roses whose prices are " + Integer.toString(myArr[0]) + " and "
				+ Integer.toString(myArr[1]) + ".");
	}

}
