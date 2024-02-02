/*2nd highest number*/
package arrayPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Example{
	public static void reverseArray(int arr[]) {
		for(int i = 0 ; i<arr.length; i++) {
			for(int j = 0 ; j <arr.length-1-i; j++) {
				if(arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;	
				}				
			}		
		}
		
		System.out.println(Arrays.toString(arr));
		
}
	
	public static void main(String args[]) {
		int inputs[] = {20,4,6,9,15};
		reverseArray(inputs);
		
		
	}
		
}