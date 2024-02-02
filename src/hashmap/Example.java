/* Who is the winner
 * inputs[] = {Mahesh,Suresh,Sitesh,Rupesh,Mahesh} */
package hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Example {
	public static String winner(String arr[]) {
		LinkedHashMap<String,Integer> hmap = new LinkedHashMap<String, Integer>();
		String winner = "";
		int maxCount = 0;
		for(String input:arr) {
			if(hmap.containsKey(input)) {
				 hmap.put(input,hmap.get(input)+1);
				
			}else {
				hmap.put(input,1);
			}
		}
		System.out.println(hmap);
		for(Map.Entry<String, Integer> entry:hmap.entrySet()) {
			 String key = entry.getKey() ;
			 int count = entry.getValue();
			 if(count > maxCount) {
				 maxCount = count;
				 winner = key;				 
			 }	
		}		
		return winner;
	}	
	public static void main(String args[]) {
		String inputs[] = {"Mahesh","Suresh","Sitesh","Rupesh","Mahesh","Sitesh"} ;
		String res = winner(inputs);
		System.out.println(res);
		
	}
}