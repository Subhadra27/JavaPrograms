package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmailAddress {
	
	public  static void validEmail(String email) {
		String regex  = "^[a-zA-Z.]+@[a-zA-Z.]+$";
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(email);
		boolean isContains = matcher.find();
		if(isContains) {
			System.out.println("Email is valid");
		}
		else {
			System.out.println("Wrong email format");
		}
		
		//return true; 
		
	}

	public static void main(String[] args) {
		
		String email = "sub.sah@g.com";
		System.out.println(email);
		validEmail(email);
		//System.out.println(email +validEmail(email) );

	}

}
