/*Count Vowels and Consonants*/
package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class VIMP_CountVowelsAndConsonants {
	
	public static void containsVowelAndConsonants(String input) {
		int vowelsCount = 0;
		int consonantsCount = 0;
		String vowelsString = "aeiouAEIOU";
		String ConsonantsString = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVXYZ";
		for(int i =0;i <= input.length()-1; i++) {			
			if(vowelsString.contains(input.charAt(i)+"")) {
				vowelsCount++;
				
			}else if(ConsonantsString.contains(input.charAt(i)+"")) {
				consonantsCount++;				
			}else {
				//System.out.println("It should not consider as a vowel or consonant"+ input.charAt(i));
			}
		}
		System.out.println("The number of vowels are "+ vowelsCount );
		System.out.println("The number of consonants are "+ consonantsCount);
		
	}
	
	public static void vowelsAndConsonants(String input) {
		int vowelNum = 0;
		int consonanatNum = 0;		
		for(int i =0;i <= input.length()-1; i++) {
			if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u')
			{
				//System.out.println("The character is a vowel " + input.charAt(i));
				vowelNum++;
				
			}else if(input.charAt(i) == ' ') {
				
			}			
			else{
				
				//System.out.println("The character is a consonant " + input.charAt(i));
				consonanatNum++;				
			}
			
		}
		System.out.println("The number of consonants are " + consonanatNum);
		System.out.println("The number of vowels are " + vowelNum);
		
	}

	
	//Not a good idea
	public static void countVowelsAndConsonants(String input) {
		
		HashMap<Character,Integer> maps = new HashMap<Character,Integer>();
		int vowelCount = 0;
		int consonanatCount = 0;
		
		for(int i =0 ; i <= input.length()-1; i++) {
			if(maps.containsKey(input.charAt(i))) {
				maps.put(input.charAt(i), maps.get(input.charAt(i))+1);
			}else {
				maps.put(input.charAt(i), 1);
			}			
		}
		System.out.println(maps);
		
		for(Map.Entry<Character, Integer> entry : maps.entrySet()) {
		
			char ch = entry.getKey();
			int value = entry.getValue();
			if( ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u' ) {
				
				vowelCount = vowelCount +value ;
				
			}
			else {
				consonanatCount = consonanatCount + value;
			}
			
		}
		System.out.println("The number of vowels are " + vowelCount + " and the number of consonants are " + consonanatCount);
		
	}
	public static void main(String[] args) {
		
		String word ="Find list";
		containsVowelAndConsonants(word);
		//vowelsAndConsonants(word);
		//countVowelsAndConsonants(word);

	}

}
