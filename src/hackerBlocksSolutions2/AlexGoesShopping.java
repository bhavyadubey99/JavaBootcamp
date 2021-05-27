package hackerBlocksSolutions2;

import java.util.Scanner;

public class AlexGoesShopping {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // no of items in shop.

		int[] items = new int[n]; // array of items.

		for (int i = 0; i < n; i++) {
			items[i] = sc.nextInt();
		}

		int q = sc.nextInt(); // no of queries.

		for (int c = 1; c <= q; c++) {
			int A = sc.nextInt();
			int k = sc.nextInt();

			if (check(A, k, items)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

	public static boolean check(int amount, int choices, int[] items) {
		boolean feasible = false;
		int count = 0;
		for (int i = 0; i < items.length; i++) {
			if ((amount / items[i] > 0) && ((amount % items[i]) == 0)) {
				count++; 
			}
		}
		
		if(count == choices) {
			feasible = true;
		}

		return feasible;
	}

}
