package bitManipulation;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {
	
	public static void main(String[] args) {
		
		System.out.println(generateGrayCode(2));
		
	}
	
	public static List<Integer> generateGrayCode(int n) {
		
		//base case
		
		if(n == 1) {
			List<Integer> baseRes = new ArrayList<Integer>(); 
			baseRes.add(0);
			baseRes.add(1);
			return baseRes;
		}
		
		
		
		List<Integer> recRes = generateGrayCode(n -1); 
		
		
		
		List<Integer> myList = new ArrayList<>(recRes);
		
		
		
		for(int i = 0; i < recRes.size(); i++) {
			myList.add((int) (recRes.get(i) + Math.pow(2,  n - 1))); 
		}
		
		
		return myList;
		
	}

}
