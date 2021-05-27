package hackerBlocksSolutions1;

import java.util.Scanner;

public class NthFibonacci {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a = 0;
		int b = 1;
		
		int count = 0;
		while(count < n) {
			
			//changes
			int sum = a + b;
			a = b;
			b = sum;
			count += 1;
		}
		System.out.println(a);
	}

}
