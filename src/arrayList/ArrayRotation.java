/*Array Rotation: Rotate the elements of an array to the right by a given number of positions.*/

package arrayList;

import java.util.Arrays;

public class ArrayRotation {
	
	public static String rotateArray(int arr[],int right) {
		int resArray[] = new int[arr.length] ;
		int z = 0;
		int s = arr.length-right;
		for(;s < arr.length; s++) {
			
			resArray[z] = arr[s];
			z++;		
			
		}
//		System.out.println(z);
//		System.out.println(s);
//		System.out.println(Arrays.toString(resArray));
		for(int i =0;i < arr.length-right ;i ++) {
			
			resArray[z] = arr[i];
			z++;
			
		}
		return Arrays.toString(resArray);
		
	}

	public static void main(String[] args) {
		int input[] = {20,12,23,17,89,10};
		int input1[] = {2,3,5,7,9};
		int shiftRight = 2;
		
		System.out.println(rotateArray(input,shiftRight));
		System.out.println(rotateArray(input1,shiftRight));
		

	}

}
