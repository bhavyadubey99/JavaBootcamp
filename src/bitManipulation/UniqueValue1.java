package bitManipulation;

public class UniqueValue1 {

	public static void main(String[] args) {

		int[] arr = { 10, 15, 25, 15, 60, 60, 67, 25, 10 };
		
		int ans = 0; 
		
		for(int i = 0; i < arr.length; i++) {
			ans = ans ^ arr[i]; 
		}
		
		System.out.println(ans);
	}

}
