/*Given an array with all distinct elements, find the largest three unique elements.
 Input: arr[] = {10, 4, 3, 50, 23, 90}
Output: 90, 50, 23*/

package arrayPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class LargestThreeElements {
	
	public static void largestThreeElements(int arr[]) {
		Arrays.sort(arr);
		System.out.println("The first element is :-> " + arr[arr.length-1]);
		System.out.println("The second element is :-> " + arr[arr.length-2]);
		System.out.println("The third element is :-> " + arr[arr.length-3]);
	}

	public static void main(String[] args) {
		
		int arr_input[] = {29,12,50,60,291,60};
		//largestThreeElementsWithUnique(arr_input);
		// TODO Auto-generated method stub

	}

}
