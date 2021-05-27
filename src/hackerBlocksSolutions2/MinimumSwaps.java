package hackerBlocksSolutions2;

import java.util.Scanner;

public class MinimumSwaps {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = sc.nextInt(); //size of array.
		
		int[] arr = new int[n]; //array
		
		//taking inputs.
		for(int i = 0; i < n ; i++) {
			arr[i] = sc.nextInt(); 
		}
		
		System.out.println(minimumSwaps(arr));
		
		
		
	}
	
	public static int minimumSwaps(int[] arr) {
		int swaps = 0; 
		
		//logic. 
		int i = 0; 
		while(i < arr.length) {
			if(arr[i] == i+1) {
				//at this index, the element is at the right place. for eg- at arr[0] we have 1. arr[1] we have 2. 
				//moving to the next index.
				i++;
			}
			else {
				
				//doing a swap. 
				int temp = arr[i]; 
				arr[i] = arr[temp - 1];
				arr[temp - 1] = temp; 
				swaps = swaps + 1; 
			}
		}
		return swaps; 
	}

}
