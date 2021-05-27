package hackerBlocksSolutions2;

import java.util.Scanner;

public class CalculateTheSum {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//
//		int n = sc.nextInt();
//
//		int[] arr = new int[n];
//
//		for (int i = 0; i < n; i++) {
//			arr[i] = sc.nextInt();
//		}
//
//		int q = sc.nextInt(); // no of ops.
//
//		
//		for (int i = 1; i <= q; i++) {
//			
//			int[] copy = new int[n]; 
//			
//			for(int k = 0; k < n; k++) {
//				copy[k] = arr[k]; 
//			}
//
//			int x = sc.nextInt(); // value of x.
//
//			for (int j = 0; j < n; j++) {
//				int idx = j - x;
//
//				if ((idx) < 0) {
//					idx = arr.length - x;
//				}
//
//				arr[j] = arr[j] + copy[idx];
//			}
//		
//
//		}
//		int sum = 0;
//		for(int i = 0; i < n; i++) {
//			sum += arr[i];
//		}
//
//		sum = sum % ((int) Math.pow(10, 9 + 7));
//
//		System.out.println(sum);​
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sumOfArray = 0; 
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sumOfArray += arr[i];
		}
		int q = sc.nextInt(); // no of ops.
		
		int sum = 0;

		for (int i = 1; i <= q; i++) {

			int x = sc.nextInt(); // value of x.
			sum = (int)(Math.pow(2, x)) * (sumOfArray);
			
		}
	
		
		sum = sum % ((int)Math.pow(10, 9) + 7);
		
		System.out.println(sum);



	}
}
