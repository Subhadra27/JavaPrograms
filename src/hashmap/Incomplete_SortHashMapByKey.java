package hashmap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Incomplete_SortHashMapByKey {
	static Integer value ;
	
	public static void sortHashMap(HashMap<String,Integer> hmap) {
		/*for(Map.Entry<String, Integer> entry : hmap.entrySet()) {
			value = entry.getValue();	
			
		}*/
		Collection<Integer> value = hmap.values();
		
		System.out.println(value);
		
		//System.out.println(Collections.sort(hmap));
		
		
		
		
	}

	public static void main(String[] args) {
		
		HashMap<String,Integer> inputs = new HashMap<String,Integer>();
		inputs.put("z", 2);
		inputs.put("a", 1);
		inputs.put("b", 3);
		inputs.put("t", 9);
		
		sortHashMap(inputs);
	}

}
