package hackerBlocksSolutions2;

import java.util.Scanner;

public class ArraySpiralPrintAntiClockwise {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] arr = takeInput();

		spiralPrint(arr);

	}

	public static int[][] takeInput() {

		int m = sc.nextInt(); // row
		int n = sc.nextInt(); // col

		int[][] arr = new int[m][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		return arr;
	}

	public static void spiralPrint(int[][] arr) {
		int minRow = 0;
		int maxRow = arr.length - 1;
		int minCol = 0;
		int maxCol = arr[0].length - 1;

		int totalElements = arr.length * arr[0].length;
		int count = 0;

		while (true) {

			// first column
			if (count < totalElements) {
				for (int i = minRow; i <= maxRow; i++) {
					System.out.print(arr[i][minCol] + ", ");
					count++;
				}
				minCol++;
			} else {
				System.out.print("END");
				break;
			}

			// last row
			if (count < totalElements) {
				for (int i = minCol; i <= maxCol; i++) {
					System.out.print(arr[maxRow][i] + ", ");
					count++;
				}
				maxRow--;
			} else {
				System.out.print("END");
				break;
			}

			// last column
			if (count < totalElements) {
				for (int i = maxRow; i >= minRow; i--) {
					System.out.print(arr[i][maxCol] + ", ");
					count++;
				}
				maxCol--;
			} else {
				System.out.print("END");
				break;
			}

			// first row
			if (count < totalElements) {
				for (int i = maxCol; i >= minCol; i--) {
					System.out.print(arr[minRow][i] + ", ");
					count++;
				}
				minRow++;
			} else {
				System.out.print("END");
				break;
			}

		}

	}

}
