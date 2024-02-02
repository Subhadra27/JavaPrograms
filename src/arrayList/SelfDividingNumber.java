/*A self-dividing number is a number that is divisible by every digit it contains.
For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
A self-dividing number is not allowed to contain the digit zero.
Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right].
 */
package arrayList;

import java.util.ArrayList;

public class SelfDividingNumber {
	
	public static boolean isSelfDivide(int num) {
		int originNum = num;
		while(num > 0) {
			int rem = num % 10 ;
			if(rem == 0) {
				return false;
			}
			if(originNum % rem != 0) {
				return false;
			}
			
			num = num/10;
		} 
		
		return true;	
	}
	
	public static ArrayList<Integer> selfDividingList(int left , int right) {
		ArrayList<Integer> range = new ArrayList<Integer>();
		for(int i = left ; i <= right ; i++) {
			if(isSelfDivide(i)) {				
				range.add(i);	
				System.out.println(range);
			}			 
		}
		return range;		
	}

	public static void main(String[] args) {
		int left = 1;
		int right= 22;		
		System.out.println(selfDividingList(left, right));

	}

}
