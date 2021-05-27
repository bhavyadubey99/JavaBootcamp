package test;

import java.util.Scanner;

public class challenge2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt(); // test cases

		for (int t = 1; t <= tc; t++) {
			int nb = sc.nextInt(); // no of buildings

			int[] hob = new int[nb]; // heights of buildings.

			for (int i = 0; i < nb; i++) {
				hob[i] = sc.nextInt(); // heights of buildings.
			}
			
			System.out.println(sunset(hob));

		}


	}

	public static int sunset(int[] arr) {

		int count = 0;

		int p = 0;

		int maxHeight = Integer.MIN_VALUE;

		while (p < arr.length) {

			if (arr[p] >= maxHeight) {
				maxHeight = arr[p];
				count++;
			}

			p++;

		}

		return count;

	}

}
