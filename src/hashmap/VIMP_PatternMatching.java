package hashmap;

import java.util.HashMap;

public class VIMP_PatternMatching {

	public static boolean designPatterns(String str1,String str2) {
		
		/*
		 * if(str1.length() != str2.length()) {
		 * System.out.println("Pattern is not matching"); }
		 */
		
		HashMap<String,String> hmap = new HashMap<String,String>();
		
		for(int i = 0 ; i< str1.length();i ++) {
			if(hmap.containsKey(str1.charAt(i)+"")) {
				if(!(str2.charAt(i)+"").equals(hmap.get(str1.charAt(i)+""))) {
					return false;					
				}				
			}else {
					
					hmap.put(str1.charAt(i)+"", str2.charAt(i)+"");
				}
				
			}
		return true;
			
		}
	
	public static void main(String[] args) {
		String input1 = "RADAR";
		String input2 = "SUPUS" ;
		boolean isMatched = designPatterns(input1,input2); 
		if(isMatched) {
			System.out.println(input1 +" "+ input2 +" are of same pattern");
		}
		else {
			System.out.println(input1 +" "+ input2 +" are not matched");
		}
		

	}

}
