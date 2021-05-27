package practiceQuestionsExtra;

public class AlphaNumericStringSum {
	
	public static void main(String[] args) {
		
		String str = "a100";
		
		int sum = 0; 
		int  i = 0; 
		
		 while(i < str.length()){
			if(Character.isDigit(str.charAt(i))) {
				int p = i; 
				String tsum = "";
				while(p <= str.length()) {
					if(p == str.length()) {
						sum += Integer.parseInt(tsum);
						i = p - 1; 
						break;
					}
					if(Character.isDigit(str.charAt(p))) {
						tsum += "" + str.charAt(p);
						p++;
					}
					else {
						sum += Integer.parseInt(tsum);
						i = p - 1 ; 
						break;
					}
				}
				
			}
			
			i++;
			
		}
		
		System.out.println(sum);
	}

}
