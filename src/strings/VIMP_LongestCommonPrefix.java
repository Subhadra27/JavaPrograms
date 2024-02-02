/*A Java Program to find the longest common prefix
 * https://www.geeksforgeeks.org/longest-common-prefix-using-character-by-character-matching/*/
package strings;

public class VIMP_LongestCommonPrefix {
	//Function to find the String having minimum length 
	
	public static int findMinLength(String arr[]) {
		int minLength = arr[0].length();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].length() < minLength) {
				minLength = arr[i].length();
			}
			
		}
		return minLength;
	}
	
	//Function that returns the longest common prefix from the array of Strings
	
	public static String longestCommonPrefix(String arr[]) {
		int minLength = findMinLength(arr);
		String result ="";
		char current;
		for(int i =0 ; i < minLength ;i++) {
			current = arr[0].charAt(i) ;
			for(int j = 1 ; j < minLength;j++) {
				if(arr[j].charAt(i) != current) {
					//System.out.println(result);
					return result;
				}				
			}
			result = result + current;
			System.out.println(result);
			
		}
		 return result;
		
	}

	public static void main(String[] args) {
		String arr[] = {"geeksforgeeks", "geeks",
	            "geek", "geezer"};
		String output =  longestCommonPrefix(arr);
		System.out.println(output);
		

	}

	
}
