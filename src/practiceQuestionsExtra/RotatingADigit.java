package practiceQuestionsExtra;

import java.util.Scanner;

public class RotatingADigit {

//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		
//		int num = sc.nextInt();
//
//		int n = sc.nextInt();
//		int temp = num;
//
//		int length = 0;
//
//		while (temp > 0) {
//			length++;
//			temp /= 10;
//		}										//MY CODE
//		
//		int rotate = 1; 
//		
//		while(rotate <= n) {
//			int rem = num % 10 ; 
//			num = num / 10;
//			num = (rem * (int)(Math.pow(10, length-1))) + num;
//			rotate++;
//		}
//		System.out.println(num);
//	}

	public static void main(String[] args) {
		int n = 123456;

		int rot = 23;

		int temp = n;

		int nod = 0;

		while (n > 0) {
			nod++;
			n = n / 10;
		}
		
		rot = rot % nod; 
		
		int rem = temp % (int)Math.pow(10, rot);
		int quotient = temp / (int)Math.pow(10, rot);
		
		int rotatedNumber = (rem * (int)Math.pow(10, (nod - rot))) + quotient;
		
		System.out.println(rotatedNumber);
	}

}
