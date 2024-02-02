package hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Good_FindParticularKeyForValue {
	
	public static void findKeyFromValue() {
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("v", 4);
		map.put("m", 2);
		map.put("a", 1);
		map.put("b", 4);
		Integer value =4;
		Collection<Integer> val  = map.values();
		System.out.println(val);
		Set<String>hset = map.keySet();
		System.out.println(hset);
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			if(entry.getValue()==value) {
				System.out.println("The key for the value " + value+ " is " + entry.getKey());			
			}			
		}
	}

	public static void main(String[] args) {
		findKeyFromValue();
	}

}
