package bitManipulation;

public class DuplicateAndMissingNumber {

	public static void main(String[] args) {
		
		int[] arr = {1,4, 5, 3, 3, 2};
		
		int n = 6; 
		
		int xor = 0; 
		
		for(int val : arr) {
			xor^= val;
		}
		for(int i = 1; i <= n; i++) {
			xor ^= i; 
		}
		
		//RMSB MASK 
		int mask = (xor & (-xor));
		
		int xor1 = 0; 
		int xor2 = 0; 
		
		//1 to n
		for(int i = 1; i <= n; i++) {
			if((mask & i) == 0) {
				//bit is 0
				xor1 ^= i;
			}
			else {
				xor2 ^= i;
			}
		}
		
		//array values
		for(int val: arr) {
			if((mask & val) == 0) {
				xor1^= val;
			}
			else {
				xor2 ^= val;
			}
		}
		
		// xor1 ^ xor2 = xor  
		
		for(int val: arr) {
			if(val == xor1) {
				System.out.println("Duplicate : " + xor1 + ", Missing : " + xor2);
				break;
			}
			if(val == xor2) {
				System.out.println("Duplicate : " + xor2 + ", Missing : " + xor1);
				break;
			}
		}
	}

}
