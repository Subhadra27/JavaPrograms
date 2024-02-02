package linkedList;

import java.util.ArrayList;

public class Examples {
	public static void main(String args[]) {
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("ab");
		arr.add("bc");
		arr.add("de");
		arr.add("fg");
		
		String str[]= new String[arr.size()];
		arr.toArray(str);
		for(String st: str) {
			System.out.println(st);
			
		}
		
		System.out.println(str.getClass());
	
	
		 
		
	}

	
}
