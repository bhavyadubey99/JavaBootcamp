package Recursion;

public class PatternTriangle {

	public static void main(String[] args) {
		
		patternStar(8);

	}
	
	public static void patternStar(int n) {
		
		//base case
		if(n == 0) {
			return;
		}
		
		// BP : to make star pattern for n rows.
		
		// SP : to make star pattern for n - 1 rows. 
		
		// extra work : to make nth row of n stars.
		
		//SP
		patternStar(n - 1); 
		
		//extra work
		for(int cst = 1; cst <= n; cst++) {
			System.out.print("* ");
		}
		//next row
		System.out.println();	
		
	}

}
