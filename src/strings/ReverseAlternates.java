/*
i/p:->abc efg hij klm
o/p:->abc gfe hij mlk*/
package strings;
public class ReverseAlternates {	
	public static String reverseString(String str) {
		String res ="";
		for(int i = str.length()-1;i >= 0 ;i--) {
			res = res+str.charAt(i);
		}
		return res;		
	}
	public static String reverseAlternates(String inputs) {
		String strArray[] = inputs.split(" ");
		for(int i = 0;i < strArray.length ;i++) {
			if(i%2 != 0) {
				strArray[i] = reverseString(strArray[i]);
			}
	}
		return String.join(" ", strArray);
	}

	public static void main(String[] args) {
		String inputs = "abc efg hij klm";
		String result  = ReverseAlternates.reverseAlternates(inputs);
		System.out.println("The alternate reverse of string is-> " + result);
	}

}
