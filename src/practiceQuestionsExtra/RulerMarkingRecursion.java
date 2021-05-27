package practiceQuestionsExtra;

import java.util.Scanner;

public class RulerMarkingRecursion {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tl = 3; 
		makeRuler(1, 5);
		
		
		
	}
	
	public static void pattern(int tl) {
		
		//Base Case 
		if(tl == 0)
			return; 
		
		//SP: to print pattern for (tl - 1) 
		pattern(tl - 1);
		
		//printing tl no. of dashes. 
		for(int i = 1; i <= tl ; i++)
			System.out.print("- ");
		System.out.println();
		
		//SP again .
		pattern(tl - 1);
		
	}
	
	public static void makeRuler(int inch, int mtl) {
		//mtl -> major tick length 
		
		for(int i = 0; i < inch; i++) {
			for(int k = 0; k < mtl; k++)
				System.out.print("- ");
			System.out.println(i);
			pattern(mtl - 1); 
		}
		
		for(int i = 1; i <= mtl; i++) {
			System.out.print("- ");
		}
		System.out.println(inch);
		
	}

}
