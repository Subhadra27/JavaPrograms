package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckspecialChars {
	
	public static boolean isContainsSpecialChars(String input) {
		String regex = "^[a-zA-Z0-9]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher =pattern.matcher(input);
		boolean isContainsSpecChars = matcher.find();
		if(isContainsSpecChars) {
			
			System.out.print("Is String contains special characters? ");
			return true;
			
		}else {
			System.out.print("Is String contains special characters? ");
			return false;
		}
		
	}

	public static void main(String[] args) {
		String inputString ="1@";
		System.out.println(isContainsSpecialChars(inputString));

	}

}
