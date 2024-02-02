package strings;

public class Pallindrom {

	public static boolean stringPallindrom(String input) {
		for (int i = 0; i < input.length() / 2; i++) {
			if (input.charAt(i) != (input.charAt(input.length()-1-i))) {
				
				System.out.println("The string is not pallindorme");
				return false;

			}

		}
		System.out.println("The string is pallindorme"+" "+ input);
		return true;

	}

	public static void main(String[] args) {
		String input = "abccba";
		System.out.println(stringPallindrom(input));
		// TODO Auto-generated method stub

	}

}
