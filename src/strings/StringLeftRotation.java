
		//Formula for left shift = 1st iteration should start from  left shifht and 
		//2nd iteration should start from 0 to excluding left shift

package strings;

import java.util.Arrays;

public class StringLeftRotation {
	
	public static void leftShift(String input[],int leftShift) {
		String res[] = new String [input.length];
		int index = 0; 
		for(int i = leftShift;i < input.length ; i++) {
			res[index] = input[i];
			index++;			
		}
		for(int i = 0;i < leftShift ; i++) {
			res[index] = input[i];
			index++;			
		}
		
		System.out.println((Arrays.toString(res))); 
		
	}

	public static void main(String[] args) {
		
		String inputs [] = {"a","b","c","d","e"};
		leftShift( inputs, 2);

	}

}
