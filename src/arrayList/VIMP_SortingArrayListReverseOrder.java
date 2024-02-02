package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class VIMP_SortingArrayListReverseOrder {
	
	public static ArrayList<String>  sortingReverseOrder(ArrayList<String> str) {
		
		Collections.sort(str,Collections.reverseOrder());
		
		
		return str;
		
	}

	public static void main(String[] args) {
		
		ArrayList<String> str_i = new ArrayList<>();
		str_i .add("Go");
		str_i .add("Went");
		str_i .add("Gone");
		System.out.println(sortingReverseOrder(str_i));

	}

}
