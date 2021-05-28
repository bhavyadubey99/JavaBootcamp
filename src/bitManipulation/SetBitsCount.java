package bitManipulation;

public class SetBitsCount {
	
	public static void main(String[] args) {
		
		byte x = 120; 
		
		byte mask = 1; 
		
		byte count = 0;
		
		while(x != 0) {
			
			if((x & mask) == 1) {
				count++;
			}
			
			x = (byte) (x >> 1); 
		}
		
		System.out.println(count);
	}

}
