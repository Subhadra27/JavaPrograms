package arrayPrograms;

import java.util.ArrayList;

public class ReverseAnArray {
	
	public  ArrayList<Integer> reverseArray() {
		int arrayInt[] ={2,12,5,6,90};
		ArrayList<Integer> res = new ArrayList<>();
		
		for(int i =arrayInt.length-1;i>=0;i--) {
			
			res.add(arrayInt[i]);					
		}	
		return res;			
	}

	public static void main(String[] args) {
		ReverseAnArray obj = new ReverseAnArray();
		System.out.println(obj.reverseArray());
		
	}

}
