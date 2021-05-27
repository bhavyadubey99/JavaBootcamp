package hackerBlocksSolutions2;

import java.util.Scanner;

public class MaximumCircularSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(); 
		
		for(int i = 1; i <= t; i++) {
			int n = sc.nextInt(); 
			
			int[] arr = new int[n]; 
			
			for(int j =0 ; j < n; j++) {
				arr[j] = sc.nextInt(); 
			}
			
			//Maximum Circular Sum
			
			System.out.println(MaximumCircularSum(arr));
			
		}
	}
	
	public static int MaximumCircularSum(int[] arr) {
		
		//case 1 --> contirbuting elements -- kadane simple. 
		
		int CEelementsSum = kadane(arr);
		
		
		//case 2 ---> non con elements -- max.. 
		
		//changing signs and getting total sum. 
		
		int totalSum = 0;
		
		for(int i = 0; i < arr.length; i++) { 
			totalSum += arr[i];
			arr[i] = -arr[i]; 
			
		}

		
		//applying kadane
		int NCEelementsSum = kadane(arr);
		
		NCEelementsSum = totalSum + NCEelementsSum;
		
		return Math.max(CEelementsSum, NCEelementsSum);
	}
	
	public static int kadane(int[] arr) {
		
		int sum = arr[0];
		int max = arr[0]; 
		
		for(int i = 1; i < arr.length; i++) { 
			if(sum + arr[i] > arr[i]) {
				sum += arr[i]; 
			}
			else {
				sum = arr[i]; 
			}
			
			if(sum > max) {
				max = sum; 
			}
		}
		
		return max; 
	}
}
