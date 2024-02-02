package wrapperclass;

public class primitiveToString {
	
	public static String intToString(int input) {
		String output = String.valueOf(input);
		return output;
		
	}

	public static void main(String[] args) {
		String result = intToString(21);
		System.out.println(result + " " +result.getClass());

	}

}
