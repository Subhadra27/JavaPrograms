package regex;

public class CheckAnySpecialCharsWIthoutRegX {
	
	public static boolean checkSpecialChars(String inputs) {
		
		String specialChars = "!@#$%^&*(){}[]|><,.~`-_=+;?";
		for(int i =0;i<specialChars.length();i++) {
			if(inputs.contains(specialChars.charAt(i)+"")) {
				System.out.print("Does the String contains atleast 1 special char? ");
				break;
				
			}else {
				System.out.print("Does the String contains atleast 1 special char? ");
				return false;
			}
			
		}
		return true;
		
	}

	public static void main(String[] args) {
		String inputString1 ="uiy76";
		String inputString2 ="ok!@";
		System.out.println(checkSpecialChars(inputString1));
		System.out.println(checkSpecialChars(inputString2));

	}

}
