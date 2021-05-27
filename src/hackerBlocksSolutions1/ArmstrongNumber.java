package hackerBlocksSolutions1;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		sc.close();

		for (int n = n1+1; n <= n2; n++) {

			int temp = n;

			int sum = 0;

			while (n != 0) {
				int rem = n % 10;

				sum = sum + (int) Math.pow(rem, 3);

				n = n / 10;
			}
			n = temp;

			if (temp == sum) {
				System.out.println(temp);
			}
		}

	}
}