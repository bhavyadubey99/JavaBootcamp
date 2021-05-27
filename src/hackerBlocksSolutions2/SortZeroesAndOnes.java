package hackerBlocksSolutions2;

import java.util.Scanner;

public class SortZeroesAndOnes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int left = 0;
		int right = arr.length - 1;

		while (left < right) {

			while (arr[left] == 0) {
				// means 0 hai.. sab cool hai. chill kro.
				left++;
			}

			while (arr[right] == 1) {
				// means 1 hai.. sab cool hai.
				right--;
			}

			if (left < right) {
				arr[left] = 0;
				arr[right] = 1;

				left++;
				right--;
			}

		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt(); 
//		
//		int[] arr = new int[n]; 
//		
//		for(int i = 0; i < n; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		int count0 = 0; 
//		int count1 = 1; 
//		
//		for(int i = 0; i < n; i++) {
//			if(arr[i] == 0) {
//				count0++;
//			}
//			else {
//				count1++;
//			}
//		}
//		
//		for(int i = 0; i < count0; i++) {
//			arr[i] = 0; 
//		}
//		
//		for(int i = count0; i < n; i++) {
//			arr[i] = 1;
//		}
//		
//		for(int i = 0; i < n; i++) {
//			System.out.print(arr[i] + " ");
//		}
//	}

}
