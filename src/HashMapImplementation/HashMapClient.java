package HashMapImplementation;

public class HashMapClient {

	public static void main(String[] args) {

		HashMap map = new HashMap();
		
		map.put("A", 10);
		map.put("B", 30);
		map.put("C", 20);
		map.put("D", 60);
		map.put("E", 80);
		
		System.out.println(map);
		
		System.out.println(map.remove("B"));
		
		System.out.println(map);
		
		System.out.println(map.get("D"));
		System.out.println(map.get("G"));

		System.out.println(map.containsKey("E"));


		
		
	}

}
