package Hashmaps;

import java.util.*;

public class Hashmap {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();

		// put
		map.put("India", 10);
		map.put("UK", 20);
		map.put("US", 30);

		System.out.println(map);

		// get
		System.out.println(map.get("India"));

		// containskey
		System.out.println(map.containsKey("China"));

		// getting a set of keys.
		Set<String> keys = map.keySet();

		for (String val : keys) {
			System.out.println(val);
		}

	}

}
