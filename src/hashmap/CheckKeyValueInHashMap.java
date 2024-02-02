package hashmap;

import java.util.HashMap;

public class CheckKeyValueInHashMap {	
	public static boolean checkKeyValueInHashMap(HashMap<String,Integer> hmap,String k,Integer v) {
		boolean isContains = true;
		if (hmap.containsKey(k) && hmap.containsValue(v)) {			
			return isContains;			
		}
		else {
			isContains = false;
		}
		return isContains;
	}
	public static void main(String[] args) {
		
		HashMap<String,Integer> maps = new HashMap<String,Integer>();
		maps.put("Brillio", 2);
		maps.put("TCS", 5);
		maps.put("Eurofins", 1);
		maps.put("ITC", 2);		
		String key ="Brillio";
		int value = 5;		
		
		System.out.println(" "+ checkKeyValueInHashMap(maps,key,value));
	}

}
