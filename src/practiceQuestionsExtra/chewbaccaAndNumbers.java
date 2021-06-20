package practiceQuestionsExtra;

import java.util.Scanner;

public class chewbaccaAndNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		int a = chewbacca(s);
		
		System.out.println(a);
	}

	public static int chewbacca(String s) {

		int[] arr = new int[s.length()];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = Integer.parseInt(s.charAt(i) + "");
		}

		int ans = 0;

		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] == 0 && i == 0) {
				
				ans = 9;
				
			}
			else if(arr[i] >= 5 && arr[i] != 9) {
				
				ans = ans * 10 + (9 - arr[i]);
				
			}
			else if(arr[i] == 9) {
				if(i == 0) {
					ans = 9; 
				}
				else {
					ans = ans * 10; 
				}
			}
			else {
				ans = ans * 10 + arr[i]; 
			}

		}
		
		return ans;

	}

}
