package hackerBlocksSolutions1;

import java.util.Scanner;

public class SumOfOddPlacedAndEvenPlaced {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int sumEven = 0;
		int sumOdd = 0;
		int place = 1;

		while (n > 0) {
			int rem = n % 10;

			if (place % 2 == 0) {
				sumEven += rem;
			} else {
				sumOdd += rem;
			}

			n /= 10;
			place++;
		}
		System.out.println(sumOdd);
		System.out.println(sumEven);
	}

}
