package hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetToList {
	
	public static void hashSetToList( HashSet<String> set ) {		
		List<String> list = new ArrayList<String>(set);	
		System.out.println(list.getClass());
	}

	public static void main(String[] args) {		
		HashSet<String> inputs = new HashSet<String>(); ;		
		inputs.add("ab");
		inputs.add("bc");
		inputs.add("de");
		hashSetToList( inputs );
	}

}
