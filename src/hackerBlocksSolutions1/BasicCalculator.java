package hackerBlocksSolutions1;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			char ch = sc.next().charAt(0);
			int result;

			if (ch == '+') {
				
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				result = n1 + n2;
				System.out.println(result);
				
			} else if (ch == '-') {
				
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				result = n1 - n2;
				System.out.println(result);
				
			} else if (ch == '*') {
				
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				result = n1 * n2;
				System.out.println(result);
				
			} else if (ch == '/') {
				
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				result = n1 / n2;
				System.out.println(result);
				
			} else if (ch == '%') {
				
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				result = n1 % n2;
				System.out.println(result);
				
			} else if(ch == 'x' || ch == 'X') {
				break;
			}
			else {
				System.out.println("Invalid operation. Try again.");
			}
		}

	}

}
