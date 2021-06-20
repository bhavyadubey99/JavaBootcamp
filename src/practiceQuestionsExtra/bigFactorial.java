package practiceQuestionsExtra;

import java.util.ArrayList;
import java.util.Scanner;

public class bigFactorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		ArrayList<Integer> res = findFact(n);
		
		for(int val : res) {
			System.out.print(val);
		}
	}

	public static ArrayList<Integer> findFact(int n) {

		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(1);

		for (int i = 2; i <= n; i++) {
			// multiply, and it will give new arraylist.

			al = multiply(al, i);

		}

		return al;
	}

	public static ArrayList<Integer> multiply(ArrayList<Integer> al, int n) {

		int carry = 0;


		for (int i = al.size() - 1; i >= 0; i--) {

			int r = al.get(i) * n;
			
			r = r + carry; 
			
			int ans = r % 10; 
			
			al.set(i, ans);
			
			carry = r / 10;

		}
		
		if((al.get(0) + carry * 10) /10 > 0) {
			al.add(0, carry);
		}
		
		return al;
	}

}
