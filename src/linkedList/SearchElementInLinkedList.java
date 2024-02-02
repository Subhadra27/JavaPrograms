package linkedList;

import java.util.LinkedList;

public class SearchElementInLinkedList {
	public static boolean searchElement(LinkedList<String> input, String element) {
	
		//for(String str:input) {
			if(input.contains(element)) {
				return true;						
			}
			else {
				return false;
			}
		//}
		//return true;
	
	}

	public static void main(String[] args) {
		
		LinkedList<String> inputs = new LinkedList<>();
		inputs.add("arr");
		inputs.add("ar");
		inputs.add("arra");
		inputs.add("array");
		
		
		System.out.println(searchElement(inputs,"ab"));

	}

}
