package linkedList;

import java.util.LinkedList;

public class AddElementToLinkedList {
	
	public static LinkedList<String> addElement(LinkedList<String> list) {
		
		return list;
		
	}
	public static void main(String args[]) {
		
		LinkedList<String> list_i = new LinkedList<String>();
		list_i.add("C");
		list_i.add("C");
		list_i.add("Java");
		list_i.add("Python");
		list_i.add("Go lang");
		list_i.addFirst("First");
		list_i.addLast("Last");
		
		System.out.println(addElement(list_i));
		
		
	}

}
