package arrayList;

import java.util.ArrayList;
import java.util.List;

public class VIMP_SubStringArraylist {
	
	public static List<String> subString(ArrayList<String> str) {
		
		//ArrayList<String> res = new ArrayList<>();
		
		List<String> res =  str.subList(2, 4);
		
		
		return res;
		
	}

	public static void main(String[] args) {
		
		ArrayList<String> str_i= new ArrayList<String>();
		
		str_i.add("Jan");
		str_i.add("Feb");
		str_i.add("Mar");
		str_i.add("Jun");
		str_i.add("July");
		
		System.out.println(subString( str_i));
		

	}

}
