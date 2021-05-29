package bitManipulation;

public class MagicNumber {

	public static void main(String[] args) {
		
		int n = 3; 
		
		int res = 0;
		
		int pow = 1; 
		
		while(n != 0) {
			
			int lb = n & 1; 
			
			if(lb == 1) {
				res += pow;
			}
			
			pow *= 5;
			n = n >> 1;
		}
		
		System.out.println(res);

	}

}
