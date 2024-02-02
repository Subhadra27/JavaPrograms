package strings;

public class Vimp_IfVowels {
	
	public static boolean isContainsVowels(String word) {
		String vowels ="aeiou";
		for(int i =0;i<vowels.length();i++) {
			if(word.contains(vowels.charAt(i)+"")) {
				return true;				
			}			
		}
		
		return false;
	}

	public static void main(String[] args) {
		String input;
		input = "words";
		String input1 ="aeiou";
		String input3 ="qwrtq";
		String input2 ="pyttu";
		
		
		System.out.println("The input contains vowels? " + isContainsVowels(input));
		System.out.println("The input contains vowels? " + isContainsVowels(input1));
		System.out.println("The input contains vowels? " + isContainsVowels(input2));
		System.out.println("The input contains vowels? " + isContainsVowels(input3));
	

	}

}
