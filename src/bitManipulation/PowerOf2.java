package bitManipulation;

public class PowerOf2 {
	
	public static void main(String[] args) {
		
		int n = 1; 
		
		if(n == 0) {
			System.out.println("Not a power of 2");
			return;
		}
		
		if((n & (n - 1)) == 0) {
			System.out.println("Power of 2.");
		}
		else {
			System.out.println("Not a Power of 2.");
		}
	}

}
