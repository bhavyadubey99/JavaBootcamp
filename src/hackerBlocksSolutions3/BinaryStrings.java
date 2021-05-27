package hackerBlocksSolutions3;

public class BinaryStrings {

	public static void main(String[] args) {
		
		BinaryString("1?1", "");
		
		
	}
	
	public static void BinaryString(String ques, String ans) {
		
		//base case: 
		if(ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		
		
		String roq = ques.substring(1); 
		
		char ch = ques.charAt(0);
		
		//checking whether it is a wild card character. 
		if(ch == '?') {
			//wild card character 
			BinaryString(roq, ans + '0'); 
			BinaryString(roq, ans + '1'); 
		}
		else {
			BinaryString(roq, ans + ch); 
		}
		
	}
}
