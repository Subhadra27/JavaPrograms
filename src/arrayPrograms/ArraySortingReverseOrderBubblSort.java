package arrayPrograms;

import java.util.Arrays;

public class ArraySortingReverseOrderBubblSort {
	
	public static void arraySorting(int arr[]) {
		for(int i = 0;i < arr.length ;i++) {
			for(int j=0 ;j< arr.length-1-i;j++) {
				if(arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;					
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
	}

	public static void main(String[] args) {
		int input[]= {23,1,7,90,87};
		arraySorting(input);
		

	}

}
