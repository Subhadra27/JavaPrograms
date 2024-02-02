
/*You are given an array numbers that contains integers. 
 * You need to return one array of the same length, first filled with even numbers and then by odd numbers.
 * Input:
numbers = [54, 43, 2, 5, 14, 17, 18, 19]
Output: 
54 2 14 18 43 5 17 19

Input:
numbers = [5, 6, 7, 2, 4, 8, 9]
Output:
6 2 4 8 5 7 9
 * */
 package arrayPrograms;

import java.util.ArrayList;

public class OddEvenSeparate {
	
	public static ArrayList<Integer> oddEven(int arr[]) {
		ArrayList<Integer> arrListEven = new ArrayList<>();
		ArrayList<Integer> arrListOdd = new ArrayList<>();
		ArrayList<Integer>res = new ArrayList<>();
		
		for(int i:arr)
		{
			if(i%2 == 0){
				arrListEven.add(i);
				
				
			}else {
				arrListOdd.add(i);
								
			}			
		}		   
		   
		res.addAll(arrListEven);
		res.addAll(arrListOdd);
		return res;
		
	}

	public static void main(String[] args) {
		int arr1[] = {54, 43, 2, 5, 14, 17, 18, 19};
		int arr2[] = {5, 6, 7, 2, 4, 8, 9};
		
		System.out.println("The even and odd array is "+oddEven(arr1));
		System.out.println("The even and odd array is "+oddEven(arr2));

	}

}
