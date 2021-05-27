package practiceQuestionsExtra;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfTwoArrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] one = { 1, 2, 3, 4, 5 };
		int[] two = { 1, 3, 3, 4, 5, 5, 6, 6 };

		ArrayList<Integer> ans = new ArrayList<Integer>();

		int i = one.length - 1;
		int j = two.length - 1;
		int carry = 0;

		while (i >= 0 || j >= 0) {

			int sum = carry; 
			
			if(i >= 0) {
				sum += one[i]; 
			}
			if(j >= 0) {
				sum += two[j]; 
			}
			
			int rem = sum % 10; 
			ans.add(0, rem);
			carry = sum / 10; 
			
			i--;
			j--; 
		}
		
		if(carry > 0) {
			ans.add(0,carry);
		}
		
		System.out.println(ans);
		
		
	}
}
