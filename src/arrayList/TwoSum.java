/*Given an array of integers nums and an integer target, return indices of the two numbers 
 such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use
 the same element twice.
You can return the answer in any order.*/
package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {	
	public static ArrayList<Integer> twoSumList(ArrayList<Integer> intList,int target) {
		ArrayList<Integer> indices = new ArrayList<Integer>();
		int indexSecNum =0;
		
		for(int i = 0 ; i < intList.size(); i ++) {
			int secNum = target - intList.get(i);
			if(intList.contains(secNum)) {
				indexSecNum = intList.indexOf(secNum);
				indices.addAll(Arrays.asList(i,indexSecNum));
				break;
				
			}else {
				
			}			
		}
		
		return indices;
	}

	
public static int[] twoSum(int[] nums, int target) {
	int[] indices = new int[2];
	int secIndex =0 ;	
	for(int i =0,j = 0 ;i < nums.length ; i++ , j++) {		
		int secNum = target-nums[i];
		if(nums[j] == secNum ) {
			 secIndex = j;	
		}
		indices[0] = i;
		indices[1] = j;
		break;
	}   
	return indices;	
    }
	public static void main(String[] args) {
		ArrayList<Integer> inputList = new ArrayList<Integer>();
		inputList.add(10);
		inputList.add(5);
		inputList.add(8);
		inputList.add(9);
		
		int input[] = {10,5,8,10,9};
		
		System.out.println(twoSumList(inputList,13));
		
		//System.out.println(Arrays.toString(twoSum(input,13)));
	}

}
