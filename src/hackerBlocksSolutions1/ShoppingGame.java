package hackerBlocksSolutions1;

import java.util.Scanner;

public class ShoppingGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numberOfTestCases = sc.nextInt();

		for (int counter = 1; counter <= numberOfTestCases; counter++) {

			int m = sc.nextInt(); // Aayush
			int n = sc.nextInt(); // Harshit
			
			int ayushcounter = 1;
			int harshitcounter = 2; 
			
			int AyushPhones = 0;
			int HarshitPhones = 0;

			while (AyushPhones <= m && HarshitPhones <= n) {
				
				AyushPhones += ayushcounter;
				HarshitPhones += harshitcounter;
				
				ayushcounter += 2; 
				harshitcounter += 2;
				
			}
			
			if (AyushPhones > m) {
				System.out.println("Harshit");
			}
			else {
				System.out.println("Aayush");
			}

		}
	}

}
