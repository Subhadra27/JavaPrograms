package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListToArrayList {
	
	public static ArrayList<String> linkedListToAraryList(LinkedList<String> list){
		ArrayList<String> arrlist = new ArrayList<>();
		//list= new LinkedList<String>();
		for(String lst:list) {
			
			arrlist.add(lst);
			
			
		}
		
		return arrlist;
		
	}

	public static void main(String[] args) {
		LinkedList<String> input =new LinkedList<>();
		input.add("Yes");
		input.add("No");
		input.add("May be");
		input.add("Yes/No");
		
			
	
		System.out.println(linkedListToAraryList(input));

	}

}
