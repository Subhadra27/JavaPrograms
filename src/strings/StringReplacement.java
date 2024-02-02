/*Write a program that replaces all occurrences of a specified substring in a given string 
with another string.
 * 
 */
package strings;

import java.util.Arrays;

public class StringReplacement {
	
	public static String subStringReplacement(String input ,String str1 , String str2) {

		
		String result = input.replace(str1, str2);
		String result1 = input.replace(str1, str2);
		
		
		
		
		return result;
	}

	public static void main(String[] args) {
		String data = "this is a String and this is also a statment";
		String sub1 = "this";
		String sub2 = "It";
		
		System.out.println(subStringReplacement(data ,sub1 , sub2));
		
		System.out.println(subStringReplacement(data ,sub1 , sub2));

	}

}
