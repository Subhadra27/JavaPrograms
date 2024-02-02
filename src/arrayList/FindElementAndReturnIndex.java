/*Implement a search functionality to find an element in an ArrayList and return its index.*/
package arrayList;

import java.util.*;

public class FindElementAndReturnIndex {
	
	public static int findElementReturnIndex(ArrayList<Integer> arrList , int num) {
		for(int i = 0 ;i < arrList.size() ; i++) {
			if(arrList.get(i) == num) {
				System.out.println("The element is " + num +" and its index is " + i);
				return i;
				}
		}
		System.out.println("Element is not present in the list " + num);
		return -1;
		
	}

	public static void main(String[] args) {
		ArrayList<Integer> inputs = new ArrayList<Integer>();
		inputs.add(55);
		inputs.add(50);
		inputs.add(-100);
		inputs.add(3);
		inputs.add(5);		
		int res = findElementReturnIndex(inputs , -200);
		
	}

}
