package strings;

public class RemoveSpacesInAString {
	
	public static String removeSpaces(String input) {
		
		 String result;
		String words[]= input.split(" ");
		result = String.join("", words);

		return result;
		
		
	}

	public static void main(String[] args) {
		String data = " The String contains space";
		System.out.println(removeSpaces(data));

	}

}
