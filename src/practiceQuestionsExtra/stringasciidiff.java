package practiceQuestionsExtra;

import java.util.Scanner;

public class stringasciidiff {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		String s = sc.next(); 
		
		asciidiff(s); 
	}
	
	public static void asciidiff(String s) {
		
		System.out.print(s.charAt(0));
		
		for(int i = 0; i < s.length() - 1; i++) {
			
			int c1 = s.charAt(i); 
			int c2 = s.charAt(i + 1);
			int diff = c2 - c1; 
			System.out.print(diff + "" + s.charAt(i + 1));
			
			// System.out.println(c1 + " " + c2);
			
		}
		
	}
}
