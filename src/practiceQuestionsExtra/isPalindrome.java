package practiceQuestionsExtra;

import java.util.Scanner;

public class isPalindrome {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		
		boolean flag = true;

		if (n % 2 == 0) {

			for (int i = 0; i < n; i++) {

				if (arr[i] != arr[n - i - 1]) {
					System.out.println("false");
					flag = false;
					break;
				}

			}
		}

		else {
			
			for(int i = 0; i <n ; i++) {
				
				if(i == n /2) {
					continue;
				}
				
				else if (arr[i] != arr[n - i - 1]) {
					System.out.println("false");
					flag = false;
					break;
				}
				
			}

		}
		
		
		if(flag) {
			System.out.println("true");
		}
	}

}
