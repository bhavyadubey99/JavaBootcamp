package practiceQuestionsExtra;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] one = new int[n];

		for (int i = 0; i < n; i++) {
			one[i] = sc.nextInt();
		}

		int m = sc.nextInt();

		int[] two = new int[m];

		for (int i = 0; i < m; i++) {
			two[i] = sc.nextInt();
		}

		add(one, two);
	}

	public static void add(int[] one, int[] two) {
		int m = one.length;
		int n = two.length;

		ArrayList<Integer> ans = new ArrayList<>();

		int min = Integer.min(m, n);

		int i = m - 1;
		int j = n - 1;

		int carry = 0;

		while (i >= 0 && j >= 0) {

			int sum = one[i] + two[j] + carry;

			int r = sum % 10;

			carry = sum / 10;

			ans.add(0, r);

			// change
			i--;
			j--;

		}

		if (i < 0) {
			// means two has more elements than one
			while (j >= 0) {

				int sum = two[j] + carry;

				int r = sum % 10;

				carry = sum / 10;

				ans.add(0, r);

				// change
				j--;

			}

		} else if (j < 0) {
			// means one has more elements than two
			while (i >= 0) {
				int sum = one[i] + carry;

				int r = sum % 10;

				carry = sum / 10;

				ans.add(0, r);

				// chnage
				i--;
			}
		}
		
		

		for (int val : ans)
			System.out.print(val + ", ");

		System.out.print("END");

	}

}
