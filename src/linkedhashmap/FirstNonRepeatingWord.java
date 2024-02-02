package linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingWord {
	
	public static String firstNonRepeating(String words) {
		String inputs[] = words.split(" ");
		LinkedHashMap<String, Integer> lhmap= new LinkedHashMap<String, Integer>();
		String res =null;
		for(String str:inputs) {
			if(lhmap.containsKey(str)) {
				lhmap.put(str, lhmap.get(str)+1);
			}else {
				
				lhmap.put(str, 1);
				
			}
			
		}
		System.out.println(lhmap);
		
		for (Map.Entry<String, Integer> entry : lhmap.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			if (val == 1) {
				res = key;
				break;
			}
		}
			return res;	
	}

	public static void main(String[] args) {
		
		String inputs = "stupid fellow are really stupid";
		System.out.println(firstNonRepeating(inputs));

	}

}
