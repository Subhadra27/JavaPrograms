/*ArrayList to Array Conversion:
Convert an ArrayList to an array and vice versa. Ensure handling of data type conversions.*/

package arrayList;
import java.util.*;

public class Example {	
	public static String[] arrayListToArray(ArrayList<String> arr) {
		String[] array = new String[arr.size()];
		String res[] = arr.toArray(array);		
		for(int i = 0 ; i < res.length ; i++) {
			System.out.println(res[i]);	
		}        
        System.out.println(arr.getClass());
        System.out.println(array.getClass());
        System.out.println(res.getClass());        
        return res;
        }

	public static void main(String[] args) {
		ArrayList<String> inputs = new ArrayList<String>();
		inputs.add("array");
		inputs.add("String");
		inputs.add("arrays");
		
		//System.out.println(arrayListToArray(inputs));
		System.out.println(convertFromArrayListToArray(inputs));
		}
	
	public static String[] convertFromArrayListToArray(ArrayList<String> arrayList) {
		String[] inputArray = new String[arrayList.size()];
		for(int i = 0 ; i < arrayList.size() ; i ++) {
			inputArray[i] = arrayList.get(i) ;			
		}
				
		System.out.println(Arrays.toString(inputArray));
		return inputArray;		
	}
}
