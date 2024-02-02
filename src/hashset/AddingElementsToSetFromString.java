package hashset;
import java.util.*;
public class AddingElementsToSetFromString {	
	public static HashSet<String>  addElementsFromString(String str) {
		
		HashSet<String> set = new HashSet<>();
		
		for(int i =0;i<str.length();i++) {			
			set.add(str.charAt(i)+"");		
		}
		return set;
	}

	public static void main(String[] args) {
		String input ="aeiou aeiobcz";
		System.out.println(addElementsFromString(input));
	}

}
