package hackerBlocksSolutions1;

import java.util.Scanner;

public class RevisingQuadraticEquations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		sc.close();

		double d = (b * b) - (4 * a * c);

		if (d == 0) {
			double r = (-b) / (2 * a);
			System.out.println("Real and Equal");
			System.out.println((int) r);
			System.out.println((int) r);

		} else if (d > 0) {
			double root1 = ((-1 * b) + Math.sqrt(d)) / (2 * a);
			double root2 = ((-1 * b) - Math.sqrt(d))/ (2 * a);
			System.out.println("Real and Distinct");

			if (root1 > root2) {
				System.out.println((int) root2);
				System.out.println((int) root1);
			} else {
				System.out.println((int) root1);
				System.out.println((int) root2);
			}

		} else {
			System.out.println("Imaginary ");
		}

	}

}
