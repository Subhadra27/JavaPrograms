package strings;
import java.util.ArrayList;

public class ReverseEachWord {	
	public static String reverseArrayList(String str) {
		String res= "";
		ArrayList<String> arr = new ArrayList<>();
		
		for(int i=str.length()-1;i>=0;i--) {			
		
			arr.add(str.charAt(i)+"");
			//System.out.println(arr);
			res =String.join(res, arr);
		}
		System.out.println("Arraylist is " + arr);
		return res ;
	
	}
	
	public static String reverse(String str) {
		char res;
		String res_string ="";		
		for(int i=str.length()-1;i>=0;i--) {
			 res = str.charAt(i);
			 res_string = res_string+res;
		}
		/*for(int i=0;i<str.length()-1;i++) {
		 res = str.charAt(i);
		 res_string = res+res_string ;
	}*/
		return res_string;
	}
	
	public static String reverseEachWord(String input_string) {
		
		String input_arr[] = input_string.split(" ");
		
		ArrayList<String> str_i = new ArrayList<String>();
		for(String word:input_arr) {
			str_i.add(reverse(word));
			//strArray[i] = reverseString(strArray[i]);

			//System.out.println("input String inside for :-"+ str_i);
		}
		return String.join(" ", str_i);
	}

	public static void main(String[] args) {
		String input ="brillio is a company";
		System.out.println(reverseEachWord(input));
	}
}
