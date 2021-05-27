package practiceQuestionsExtra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IntersectionTwoArrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		int[] one = new int[n];
		
		for(int i = 0; i < n; i++) {
			one[i] = sc.nextInt(); 
		}
		
		int m = sc.nextInt(); 
		int[] two = new int[m];
		
		for(int i = 0; i < m; i++) {
			two[i] = sc.nextInt(); 
		}
		
//		Arrays.sort(one);
//		Arrays.sort(two);
		
		ArrayList<Integer> uni = union(one,two);
		
//		for(int val : uni)
//			System.out.print(val + " ");
		
		System.out.println(uni);
		
		System.out.println();

		ArrayList<Integer> inter = intersection(one, two);

//		for(int val : inter)
//			System.out.print(val + " ");
		
		System.out.println(inter);
		
		


	}

	public static ArrayList<Integer> intersection(int[] one, int[] two) {

		ArrayList<Integer> ans = new ArrayList<Integer>();

		// logic

		int p = 0;
		int q = 0;

		while (p < one.length && q < two.length) {
			if (one[p] == two[q]) {
				// found common element.
				ans.add(one[p]);
				p++;
				q++;

			} else if (one[p] < two[q]) {
				p++;
			} else {
				q++;
			}
		}

		return ans;
	}
	
	public static ArrayList<Integer> union(int[] one, int[] two){
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		//logic
//		
//		for(int i = 0; i < one.length ; i++) {
//			
//			ans.add(one[i]);
//		}
//		
//		for(int i = 0; i < two.length; i++) {
//			
//			ans.add(two[i]);
//		}
//		
		int p = 0; 
		int q = 0; 
		

		
		while (p < one.length && q < two.length) {
			if (one[p] < two[q]) {
				ans.add(one[p]);
				p++;
			} else if (one[p] > two[q]) {
				ans.add(two[q]);
				q++;
			} else if (one[p] == two[q]) {
				ans.add(two[q]);
				p++;
				q++;
			}
		}
		
		for(int i = 0; i < ans.size(); i++) {
			for(int j = i+1; j < ans.size(); j++) {
				if(ans.get(i) == ans.get(j)) {
					ans.remove(i);
				}
			}
		}
		
		return ans; 
	}

}
