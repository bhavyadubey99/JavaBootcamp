package practiceQuestionsExtra;

import java.util.Arrays;
import java.util.Scanner;

public class PythagorasTriplet {
	// sides a, b and c can be written as 2mn, m^2 - n^2 , m^2 + n^2

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int N = s.nextInt();

		int a;
		int b;
		int c;

		if (N % 2 == 0) {
			// means N is even, means it will be 2mn
			// Let N * 1 = 2mn ; m = N/2 ; n = 1
			int m = N / 2;
			int n = 1;

			// so the rest of the sides are:
			a = 2 * m * n;
			b = (m * m) - (n * n);
			c = (m * m) + (n * n);

		} else {
			// means N is odd, N != 2mn
			// N = m^2 - n^2; (m - n)(m + n)
			// N = m - n; 1= m + n;
			// N + 1 = 2m
			// m = (N + 1) / 2 ;
			// n = (N - 1) / 2;
			int m = (N + 1) / 2;

			int n = (N - 1) / 2;

			// so the rest of the sides are:
			a = 2 * m * n;
			b = (m * m) - (n * n);
			c = (m * m) + (n * n);
		}

		int[] ans = { a, b, c };
		Arrays.sort(ans);
		for (int val : ans) {
			if (val != N)
				System.out.println(val);
		}

		s.close();

	}

}
