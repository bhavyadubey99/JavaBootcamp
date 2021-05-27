package bitManipulation;

public class DecimalToBinary {
	
	public static void main(String[] args) {
		
		int n = 44; 
		int binary = 0; 
		int c = 0;
		
		//decimal to binary
		while(n != 0) {
			int rem = n % 2; 
			binary += (int)Math.pow(10,c) * rem;
			c++; 
			n = n / 2; 
		}
		
		System.out.println(binary);
	}

}
