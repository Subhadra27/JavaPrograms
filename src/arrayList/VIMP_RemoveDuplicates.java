package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class VIMP_RemoveDuplicates {
	
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> arr){
		ArrayList<Integer> res= new ArrayList<>();
		Collections.sort(arr);
		
		int temp = arr.get(0);		
		res.add(temp);
		
		for(int i =1;i<arr.size();i++)
		{
			if(temp != arr.get(i)) {
				res.add(arr.get(i));
				temp=arr.get(i);
			}
		}	
		
		
		return res;
	
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr_i = new ArrayList<>();
		arr_i.add(23);
		arr_i.add(23);
		arr_i.add(42);
		arr_i.add(21);
		arr_i.add(42);
		arr_i.add(55);
		arr_i.add(21);
		
		
		System.out.println(removeDuplicates(arr_i));
		

	}

}
