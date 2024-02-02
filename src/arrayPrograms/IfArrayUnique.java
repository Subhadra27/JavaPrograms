package arrayPrograms;

import java.util.HashMap;
import java.util.Map;

public class IfArrayUnique {
	public static void duplicates(int arr[]) {
		HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		for(int i:arr) {
			if(hmap.containsKey(i)) {
				hmap.put(i, hmap.get(i)+1);
			}
			else {
			hmap.put(i, 1);
		}
		}
		System.out.println(hmap);
		for(Map.Entry<Integer, Integer> entry:hmap.entrySet()) {
			int key = entry.getKey();
			int value = entry.getValue();
			
			  if(value > 1) {
			  System.out.println("The array does not contain unique elements" +
			  "And the duplicate element is" + key);
			  
			  }else if (value == 1) { System.out.println("The unique element is " + key); }
			 
			
			
		}
	}

	public static void main(String[] args) {
		int input[] = {2,4,5,3,2,4};
	
		duplicates(input);
	
}

	

}
