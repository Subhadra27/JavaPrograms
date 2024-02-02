
package strings;
import java.util.*;

/*buddy numbers*/

 public class Examples{	 
	 public static boolean checkBuddyNumbers(String s, String goal) {
		 char temp;
		 int index1 =0;
		 int index2 =0;
		 ArrayList<Integer> arr = new ArrayList<Integer>();		 
		 if(s.length()!=goal.length()) {
			 System.out.println("They are not buddy numbers " + s+ " " + goal);
			 return false;
		 }		 
		 for(int i = 0 ;i<s.length();i++) {			
			 if(s.charAt(i) != goal.charAt(i)) {
				 arr.add(i);
			}
		 }		 
		 if(arr.size() != 2) {
			 System.out.println("They are not buddy numbers " + s+ " " + goal);
			 return false;
		 }
		 index1 = arr.get(0);
		 index2 = arr.get(1);
		 if(s.charAt(index1) == goal.charAt(index2) && s.charAt(index2) == goal.charAt(index1))
				 {
					 System.out.println("They are buddy numbers " + s+" " + goal);
					 return true;	
		 }
		return false;		 
 }
	 
	 public static void main(String args[]) {
		 String input1 = "abcd";
		 String input2 = "aecd";
		 checkBuddyNumbers(input1,input2);		 
	 }	 
 }