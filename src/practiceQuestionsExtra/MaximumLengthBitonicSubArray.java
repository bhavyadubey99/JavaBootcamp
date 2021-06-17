package practiceQuestionsExtra;

import java.util.Scanner;

public class MaximumLengthBitonicSubArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();

		for (int t = 1; t <= tc; t++) {

			int n = sc.nextInt();

			int[] arr = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			System.out.println(maxlen(arr));

		}

	}

	public static int maxlen(int[] arr) {

		int n = arr.length;

		// increasing
		int[] inc = new int[n];

		inc[0] = 1;

		for (int i = 1; i < n; i++) {
			if (arr[i - 1] < arr[i]) {
				// prev no was less than curr no --> increasing
				inc[i] = inc[i - 1] + 1;
			} else {
				inc[i] = 1;
			}

		}
		
		System.out.println("/n Inc");
		
		for(int val: inc) {
			System.out.print(val + " ");
		}

		// decreasing
		int[] dec = new int[n];

		dec[n - 1] = 1;

		for (int i = n - 2; i >= 0; i--) {
			if(arr[i + 1] < arr[i]) {
				// next no is less than curr no --> decreasing
				dec[i] = dec[i + 1]  +1; 
			}
			else {
				dec[i] = 1; 
			}
		}
		
		System.out.println("/n Dec");
		
		for(int val: dec) {
			System.out.print(val + " ");
		}
		
		//overall
		int max = 0; 
		
		for(int i = 0; i < n; i++) {
			if(inc[i] + dec[i] - 1 > max) {
				max = inc[i] + dec[i] - 1;
			}
		}
		
		return max;
		

	}

}
