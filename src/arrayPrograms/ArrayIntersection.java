/*
 * Array Intersection: Given two arrays, 

 * find and print the intersection (common elements) between them.
 * 
 */
package arrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayIntersection {
	
	public static String arrayIntersection(int arr1[],int arr2[]) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> res = new ArrayList<>();
		
		for(int i = 0;i <= arr1.length-1 ;i++) {
			list1.add(arr1[i]);
		}
		for(int i = 0;i <= arr2.length-1 ;i++) {
			list2.add(arr2[i]);
		}
		for(int i = 0;i <= list1.size()-1;i++) {
			if(list2.contains(list1.get(i))) {
				res.add(list1.get(i));	
			}			
		}
		
		//Converting Arraylist to array
		
		//Integer array[] = new Integer[res.size()];
		//Integer resArray[] = res.toArray(array);
		//res.toArray(new Integer [res.size()])
		// Integer[] array = arrayList.toArray(new Integer[arrayList.size()]);
		//System.out.println(resArray);
		
		Integer[] array = res.toArray(new Integer[res.size()]);
		
		
		
		System.out.println("The conversion of ararylist to array is " +  array);
		for(int num:array) {
			System.out.println(num);
			
		}
		//Integer[] arr = arrlist.toArray(new Integer[arrlist.size()]);
		int index = 0;
		for(int num :res) {
			
			array[index++] = num;
			
			
		}
		
		return Arrays.toString(array);
	}

	public static void main(String[] args) {
		
		int input1[] = {20,30,76,10};
		int input2[] = {76,42,1,10};
		System.out.println("Common elements between 2 arrays are " + arrayIntersection(input1,input2));;

	}

}
