package bitManipulation;

public class MissingNumber1 {

	public static void main(String[] args) {

		int n = 7;

		int[] arr = { 1, 2, 3, 6, 7, 5 };
		
		//XORring all values in array. 
		int xor = 0;
		for(int val: arr)
			xor = xor ^ val;
		
		//XORring the values in array with numbers from 1 to n 
		for(int i = 1; i <= n; i++) {
			xor = xor ^ i; 
		}
		// the value remaining would be the missing number 
		
		//ans
		System.out.println(xor);
		
	}

}
