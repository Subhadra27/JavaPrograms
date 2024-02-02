/*Check 2 strings and check if they are anagram to each oter*/
package strings;

import java.util.HashMap;

public class Anagram {
	
	public static boolean checkAnagram(String str1 , String str2) {
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		HashMap<String,Integer> hmap1= new HashMap<String,Integer>();
		HashMap<String,Integer> hmap2= new HashMap<String,Integer>();
		
		for(int i = 0;i<str1.length();i++) {
			if(hmap1.containsKey(str1.charAt(i)+"")) {
				hmap1.put(str1.charAt(i)+"", hmap1.get(str1.charAt(i)+"")+1);
			}
			else {
					hmap1.put(str1.charAt(i)+"",1);
				}	
		}
		for(int j = 0;j<str2.length();j++) {
			if(hmap2.containsKey(str2.charAt(j)+"")) {
				hmap2.put(str2.charAt(j)+"", hmap2.get(str2.charAt(j)+"")+1);
			}
			else {
					hmap2.put(str2.charAt(j)+"",1);
			}
			
		}
		System.out.println(hmap1);
		System.out.println(hmap2);
		
		if(hmap1.equals(hmap2)) {
			System.out.println("Two strings are same");
			return true;
		}
		return false;
		/*if (str1.length()!= str2.length()){
            return false;
        }*/
        
        /*for(int i =0;i<S1.length();i++){
            if(S2.contains(S1.charAt(i))){
                return 1;
               
            }
        }*/
        
		/*
		 * if(str1.equals(str2)){
		 * 
		 * 
		 * } return true;
		 */
    }
	

	public static void main(String[] args) {		
		String input1 ="abcdffe";
		String input2 ="abcdef";
		System.out.println(checkAnagram(input1,input2));
		// TODO Auto-generated method stub

	}

}
