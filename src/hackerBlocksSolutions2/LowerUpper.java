package hackerBlocksSolutions2;

import java.util.Scanner;

public class LowerUpper {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char c = sc.next().charAt(0);
		
		if(Character.isUpperCase(c)) {
			System.out.println("UPPERCASE");
		}
		else if(Character.isLowerCase(c)) {
			System.out.println("lowercase");
		}
		else {
			System.out.println("Invalid");
		}
		
	}

}
