package hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayListToSet {
	
	public static HashSet<String>  checkAllVowels(ArrayList<String> str_inputs) {
		
		HashSet<String> hset = new HashSet<String>();
		Iterator<String> itr = str_inputs.iterator();
		while(itr.hasNext()) {
			hset.add(itr.next());
		}
		return hset;
	
	}

	public static void main(String[] args) {
		
		ArrayList<String> inputs = new ArrayList<String>();
		inputs.add("a");
		inputs.add("e");
		inputs.add("i");
		inputs.add("o");
		inputs.add("u");
		inputs.add("i");
		inputs.add(null);
		inputs.add(" ");
		inputs.add("b");
		
		
		
		System.out.println(checkAllVowels(inputs));
		// TODO Auto-generated method stub

	}

}
