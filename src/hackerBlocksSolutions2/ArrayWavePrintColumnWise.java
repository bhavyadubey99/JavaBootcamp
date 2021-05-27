package hackerBlocksSolutions2;

import java.util.Scanner;

public class ArrayWavePrintColumnWise {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[][] arr = takeInput(); 
		
		wavePrintColumnwise(arr);
		
	}
	
	public static int[][] takeInput(){
		
		int m = sc.nextInt(); //rows
		int n = sc.nextInt(); //columns
		
		int[][] arr = new int[m][n]; 
		
		for(int i = 0; i < m; i++) {
			for(int j  = 0; j < n; j++) {
				arr[i][j] = sc.nextInt(); 
			}
		}
		
		return arr; 
	}
	
	public static void wavePrintColumnwise(int[][] arr) {
	
		
		for(int col = 0; col < arr[0].length; col++) {
			if(col % 2 == 0) {
				for(int row = 0; row < arr.length; row++) {
					System.out.print(arr[row][col] + ", ");
				}
			}
			else {
				for(int row = arr.length-1; row >= 0; row--) {
					System.out.print(arr[row][col] + ", ");
				}
			}
		}
		
		System.out.print("END");
	}

}
