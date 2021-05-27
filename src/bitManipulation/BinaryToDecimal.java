package bitManipulation;

public class BinaryToDecimal {
	
	public static void main(String[] args) {
		
		int n = 1011111; 
		int mult = 1; 
		int sum = 0; 
		
		
		//decimal to binary
		while(n != 0) {
			int rem = n % 10; 
			int temp = rem * mult;
			mult = mult * 2;
			sum += temp; 
			n = n / 10; 
		}
		
		System.out.println(sum);
	}

}
