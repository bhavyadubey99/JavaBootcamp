package practiceQuestionsExtra;

import java.util.Scanner;

public class matrixSearch {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt(); 
		
		int n = sc.nextInt();  
		
		int[][] arr = new int[m][n]; 
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt(); 
			}
		}
		
		
		int row = 0; 
		int col = n - 1; 
		
		boolean f = false;
		
		int target = sc.nextInt(); 
		
		while(row < m && col < n) {
			
			if(arr[row][col] == target) {
				f = true;
				break;
			}
			else if(arr[row][col] > target) {
				col--;
			}
			else {
				row++;
			}	
			
		}
		
		if(f) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}

}
