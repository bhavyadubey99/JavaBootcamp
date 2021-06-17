package practiceQuestionsExtra;

import java.util.Scanner;

public class formBiggestNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int t = s.nextInt();

		for (int tc = 1; tc <= t; tc++) {

			int n = s.nextInt();

			int[] arr = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
			}

			bignum(arr);

		}

	}

	public static void bignum(int[] arr) {

		int i = 0;

		while (i < arr.length) {

			int j = i + 1;

			while (j < arr.length) {

				String ijs = arr[i] + "" + arr[j];
				int ij = Integer.parseInt(ijs);

				String jis = arr[j] + "" + arr[i];
				int ji = Integer.parseInt(jis);

				if (ij > ji) {
					j++;
				} else {
					// swap
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					j++;

				}
			}
			
			i++;

		}
		
		
		String ans = ""; 
			
		for(int val: arr) {
			ans = ans + val;
		}
		
		System.out.println(ans);

	}

}
