package practiceQuestionsExtra;

import java.util.Scanner;

public class RotateNXN {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = scn.nextInt();
			}
		}

		//taking tranpose 
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int temp = arr[i][j] ; 
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
	
		
		// in each column reversing elements 
		
		for(int col = 0; col < n; col++) {
			for(int row = 0; row < n /2; row++) {
				int temp = arr[row][col]; 
				arr[row][col] = arr[n - row - 1][col]; 
				arr[n - row - 1][col] = temp;
			}
		}

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
	}

}
