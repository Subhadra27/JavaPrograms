package arrayPrograms;

import java.util.Arrays;

public class VIMP_BubbleSortingArray {

	public static void sortingArry(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1- i; j++) { /*
								 * j<arr.length-1-i is for optimization it can be same as j<arr.length-1, bcoz
								 * in 1st inner loop the higest element should be at nth position
								 */

				if (arr[j + 1] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				//System.out.println("The j value is:" + j);
			}
			//System.out.println(" After inner loop");

		}
		
		System.out.println(Arrays.toString(arr));
		
		
//		for(int k:arr) {
//			System.out.print(" " + k);
//		}
		
	}

	public static void main(String[] args) {

		int arr1[] = { 100, 3, 4, 7, 1 };
		sortingArry(arr1);
	}
}
