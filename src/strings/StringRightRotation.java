package strings;

import java.util.Arrays;

public class StringRightRotation {
	
	public static String stringRotation(String input[], int rightShift ) {
		//Formula for right shift = 1st iteration should start from length-shifht and 
		//2nd iteration should start from 0 to including right shift
		int index = 0;
		String res[] = new String[input.length];
		for(int i = input.length-rightShift ;i < input.length ; i++) {
			res[index] = input[i];
			index++;
			
		}
		for(int j = 0; j < input.length - rightShift ;j++) {
			res[index] = input[j];
			index++;
			
		}
		System.out.println(Arrays.toString(res));
		
		
		
		
		return "";
		
	}

	public static void main(String[] args) {
		
		String inputs[] = {"A","B","C","D","E","F"};
		 int rightShift = 2 ;
		
		System.out.println(stringRotation(inputs, rightShift));
		

	}

}
