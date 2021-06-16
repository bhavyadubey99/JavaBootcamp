package Recursion;

import java.util.HashMap;

public class StringToInteger {

	static HashMap<Character, Integer> map = new HashMap<>();

	public static void main(String[] args) {

		map.put('0', 0);
		map.put('1', 1);
		map.put('2', 2);
		map.put('3', 3);
		map.put('4', 4);
		map.put('5', 5);
		map.put('6', 6);
		map.put('7', 7);
		map.put('8', 8);
		map.put('9', 9);

		int a = StrToInt("1234",0);

		System.out.println(a);

	}

	public static int StrToInt(String s, int ans) {

		// 1234

		// 234

		// 34

		// 4 -- > 4
		
		if(s.length() == 0) {
			return ans;
		}

		String ns = s.substring(1);

		int n = map.get(s.charAt(0));

		int rr = StrToInt(ns, ans * 10 + n); // returns 234 in integer
		
		return rr;
		
		

	}

}
