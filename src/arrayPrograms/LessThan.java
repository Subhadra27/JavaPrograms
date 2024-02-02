/*
 * You are given a number k and a array numbers that contains integers.

 *  You need to return array of numbers that are less than k.
 * 
 */
package arrayPrograms;

import java.util.ArrayList;

public class LessThan {
		public static ArrayList<Integer>  lessThan(int arr[],int k){
		ArrayList<Integer> res = new ArrayList();
		for(int i:arr) {
			if(i<k) {				
				res.add(i);					
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		int arr1[] = {21,3,412,78};
		int num = 9;
		System.out.println(lessThan(arr1,num)+"are less than "+ num);

	}

}
