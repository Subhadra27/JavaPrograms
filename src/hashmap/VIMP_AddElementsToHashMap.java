package hashmap;

import java.util.HashMap;
import java.util.Map;

public class VIMP_AddElementsToHashMap {
	
	public static HashMap<String,Integer> addElements(HashMap<String,Integer> hmap) {	
		for(Map.Entry<String, Integer> entry:hmap.entrySet()) {
			String key = entry.getKey();
			int value = entry.getValue()+10;
			
			System.out.println(key +" : "+ value);
			
		}
		return hmap;
	}

	public static void main(String[] args) {
		HashMap<String,Integer> input_map = new HashMap<String,Integer>();
		
		input_map.put("Java", 2);
		input_map.put("Oops", 1);
		input_map.put("C", 9);
		input_map.put("C++", 4);
		input_map.put("Go", 3);
		
		System.out.println("The Original map is :->" + addElements(input_map));
		

	}

}
