package Hashmaps;

import java.util.HashMap;

public class HighestFreqCharacter {

	public static void main(String[] args) {

		HashMap<Character, Integer> map = new HashMap<>();

		String given = "";

		// my way
		
		if(given.length() == 0) {
			System.out.println("Empty String");
			return;
		}

		for (int i = 0; i < given.length(); i++) {

			char c = given.charAt(i);

//			if (!(map.containsKey(given.charAt(i)))) {
//				// the map does not have the char as key already.
//				map.put(c, 1);
//			} else {
//				// map already has the entry
//				int count = map.get(c);
//				count++;
//				map.put(c, count);
//			}
			
			//we can also use the following way. 
			int nf = map.getOrDefault(c, 0) + 1; //new frequency 
			map.put(c, nf); 

		}

		int max = Integer.MIN_VALUE;
		char maxKey = given.charAt(0);

		for (Character key : map.keySet()) {
			if (max < map.get(key)) {
				max = map.get(key);
				maxKey = key;
			}
		}

		System.out.println("Maximum Frequency Character is: " + maxKey + " --> " + max);
	}

}
