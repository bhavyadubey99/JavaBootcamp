package hackerBlocksSolutions2;

import java.util.Scanner;

public class ArrayWavePrintRowWise {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int rows = sc.nextInt();

		int cols = sc.nextInt();

		int[][] arr = new int[rows][cols];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int r = 0; r < arr.length; r++) {
			if (r % 2 == 0) {
				for (int c = 0; c < arr[r].length; c++) {
					System.out.print(arr[r][c] + ", ");
				}
			} 
			else {
				for (int c = arr[r].length-1; c >= 0; c--) {
					System.out.print(arr[r][c] + ", ");
				}
			}
		}
		System.out.print("END");

	}

}
