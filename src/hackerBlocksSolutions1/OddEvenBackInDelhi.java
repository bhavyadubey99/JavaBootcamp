package hackerBlocksSolutions1;

import java.util.Scanner;

public class OddEvenBackInDelhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // no of vehicles
		
		for(int count = 1; count <= n; count++) {
			
			int vehicleNumber = sc.nextInt();
			int sumOfOddDigits = 0;
			int sumOfEvenDigits = 0;
			
			while(vehicleNumber > 0) {
				int rem = vehicleNumber % 10;
				if(rem % 2 == 0) {
					sumOfEvenDigits += rem;
				}
				else {
					sumOfOddDigits += rem;
				}
				vehicleNumber /= 10;
			}
			
			if((sumOfEvenDigits % 4 == 0) || (sumOfOddDigits % 3 == 0)) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			
		}

	}

}
