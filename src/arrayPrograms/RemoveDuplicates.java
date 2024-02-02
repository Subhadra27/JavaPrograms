package arrayPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
	
	public static void removeDuplicates(int arr[]) {
		Integer res [];
		
		HashSet<Integer> hset = new HashSet<>();
		for(int i : arr) {
			hset.add(i);	
		}
		res = hset.toArray(new Integer[hset.size()]);
		
//		for(int i :res) {			
//			System.out.println(i);		
//		}	
		System.out.println(Arrays.toString(res));
	}

	public static void main(String[] args) {
		int input[]={12,12,90,12,32,90,78};
		removeDuplicates(input);

	}

}
