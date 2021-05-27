package hackerBlocksSolutions2;

import java.util.Scanner;

public class LinearSearch {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0 ; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int m = sc.nextInt(); 
		
		
		
		
	}
	
	public static int linearSearch(int[] arr, int item) {
		for(int i = 0; i < arr.length;i++) {
			if(arr[i] == item) {
				return i;
			}
		}
		return -1;
	}

}
