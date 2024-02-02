package hashset;

import java.util.HashSet;

public class VIMP_AllVowels {
	public static boolean checkAllVowels(String inputs) {		
		HashSet<String> hset = new HashSet<>();	
		String vowels="aeiou";
		for(int i =0;i<inputs.length();i++) {
			hset.add(inputs.charAt(i)+"");
			}
		System.out.println(hset);
		
			
		
			if(hset.contains("a") && hset.contains("e") && hset.contains("i") && hset.contains("o") && hset.contains("u"))
			{
				System.out.println("The string contains all vowels");
				return true;
			}			
		
		/*for(int i =0;i<vowels.length();i++) {
			if(hset.contains(vowels.charAt(i)+"")) {
			return true;
			}
			
		}*/
		return false;
	}

	public static void main(String[] args) {
		String inputs =" aeiosu aeq";
		System.out.println(checkAllVowels(inputs));

	}

}
