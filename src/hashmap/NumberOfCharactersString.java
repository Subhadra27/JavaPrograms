package hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class NumberOfCharactersString {
	
	public static HashMap<String,Integer> numberOfChars(String str) {
		
		HashMap<String,Integer> hmap = new HashMap();
		Set<String> hset = new HashSet<String>();
		
		for(int i = 0;i<str.length();i++) {
			if(hmap.containsKey(str.charAt(i)+"")) {
				hmap.put(str.charAt(i)+"",hmap.get(str.charAt(i)+"")+1);
				
			}
			else {
				hmap.put(str.charAt(i)+"", 1);
			}		
		}
		
		hset = hmap.keySet();
		System.out.println(hset);
		System.out.println(hmap.values());
		return hmap;
		
		//System.out.println(hmap);
		
	}
	public static void main(String[] args) {
		String input = "bluia bhai bhari chatura";		
		System.out.println(numberOfChars(input));
		//numberOfChars(input);
	}

}
