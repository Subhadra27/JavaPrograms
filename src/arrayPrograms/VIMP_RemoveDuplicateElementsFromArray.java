package arrayPrograms;

import java.util.ArrayList;

public class VIMP_RemoveDuplicateElementsFromArray {
	
	int arr[] = {2,3,1,4,6,4,1};
	int count = 0;
	ArrayList<Integer> arrList= new ArrayList<>();
	
	public  void removeDuplicates(){
		
		for(int i =0;i<arr.length ;i++) {
			if(!arrList.contains(arr[i])){
				arrList.add(arr[i]);
				
			}	else {
				count++;
			}
		}
		System.out.println("The numbers which are unique "+ arrList);
		System.out.println("Total number of elements which are duplicates "+ count);
		
	}

	public static void main(String[] args) {
		VIMP_RemoveDuplicateElementsFromArray obj = new VIMP_RemoveDuplicateElementsFromArray();
		obj.removeDuplicates();
	}

}
