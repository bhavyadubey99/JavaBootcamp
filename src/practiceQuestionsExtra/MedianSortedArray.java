package practiceQuestionsExtra;

import java.util.Scanner;

public class MedianSortedArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] one = new int[n];

		int[] two = new int[n];

		for (int i = 0; i < n; i++) {
			one[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			two[i] = sc.nextInt();
		}

		int[] res = new int[2 * n];

		int i = 0;
		int j = 0;

		int c = 0;

		while (i < n && j < n) {

			if (one[i] < two[j]) {
				res[c] = one[i];
				c++;
				i++;
			} else if (one[i] > two[j]) {
				res[c] = two[j];
				c++;
				j++;
			} else {
				res[c] = one[i];
				res[c + 1] = two[j];
				c += 2;
				i++;
				j++;
			}
		}

		if (i < n) {
			// means i hasn't crossed the last element
			while (i < n) {
				res[c] = one[i];
				c++;
				i++;
			}
		} else {
			// means j hasn't crossed the last element
			while (j < n) {
				res[c] = two[j];
				c++;
				j++;
			}
		}

		System.out.println(res[n - 1]);

	}

}
