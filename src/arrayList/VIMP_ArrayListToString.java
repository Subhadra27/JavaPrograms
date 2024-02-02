package arrayList;

import java.util.ArrayList;

public class VIMP_ArrayListToString {
	
	public static String arrayLIstToString(ArrayList<String> arrList) {
		
		StringBuilder sb = new StringBuilder();
		
		for(String str:arrList) {
			sb.append(str).append(",");			
		}
		String format = sb.toString();
		
		System.out.println(format.getClass());
	
		return format;
	}
	
	public static void stringConcat(ArrayList<String> arr) {
		String res ="";
		for(int i = 0 ;i < arr.size(); i++) {
			res += arr.get(i);
						
		}
		System.out.println(res);
		
		
		
	}

	public static void main(String[] args) {		
		ArrayList<String> str_i = new ArrayList<String>();
		str_i.add("Java");
		str_i.add("Selenium");
		str_i.add("Go");
		str_i.add("C");	
		System.out.println(arrayLIstToString(str_i));
		stringConcat(str_i);

	}

}
