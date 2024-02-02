package strings;


public class ReverseAString {
	
	public static String reverseAString(String input) {
		
		if(input == null) {
			System.out.println("The String is null");
			return input;
		}
		if(input.isBlank()) {
			System.out.println("The String is blank");
			return input;
		}
		
		if(input.length() == 1 || input.length() == 0) {
			return input;
		}
		
		String rev = "";
		int len = input.length()-1;
		
		for(int i = len;i >= 0 ;i--) {
			rev = rev + input.charAt(i);		
		}
		return rev;
		
	}
	public static void main(String[] args) {
		System.out.println(reverseAString("Selenium"));
		System.out.println(reverseAString("w"));
		System.out.println(reverseAString(null));
		System.out.println(reverseAString(" "));
		System.out.println(reverseAString(""));
		System.out.println(reverseAString("     "));

	}

}
