package hackerBlocksSolutions2;

import java.util.Scanner;

public class reverseArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 
		
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		reverse(arr);
		display(arr);
	

	}
	
	public static void reverse(int[] arr) {
		
		//reversing the array. 
		
		int hi = arr.length - 1; 
		int lo = 0;
		
		while(hi > lo) {
			int temp = arr[hi];
			arr[hi] = arr[lo]; 
			arr[lo] = temp; 
			
			hi--;
			lo++;
		}
	}
	
	public static void display(int[] arr) {
		
		for(int val: arr) {
			System.out.println(val);
		}
	}

}
