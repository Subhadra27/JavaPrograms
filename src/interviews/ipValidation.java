/*valid ip address*/

package interviews;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ipValidation {
	
	public static void validateIP(String str) {
		Pattern pattern = Pattern.compile(str);
		Matcher matcher = pattern.matcher(str);
		
		System.out.println();
		
		
	}

	public static void main(String[] args) {
		String ip = "120.13.23.90";
		validateIP(ip);

	}

}
