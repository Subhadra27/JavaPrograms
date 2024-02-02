package linkedList;

import java.util.LinkedList;

public class VIMP_SecondHighest {
	
	public static int secondHighest(LinkedList<Integer> inputList) {
		
		if(inputList == null || inputList.size()<2 ) {
			
			throw new IllegalArgumentException ("List should contain atleast 2 characters");
			
		}
		int highestElement = Integer.MIN_VALUE;
		int secondhighestElement = Integer.MIN_VALUE;
		
		for(int num:inputList) {
			
			if(num>highestElement) {
				secondhighestElement =highestElement;
				highestElement=num;				
			}else if(num>secondhighestElement && num!=highestElement){
				secondhighestElement= num;
				
			}
			
		}if(secondhighestElement == Integer.MIN_VALUE) {
			throw new IllegalArgumentException ("Second highest number not found");
			
		}
		
		return secondhighestElement;
		
	}

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList();
		list.add(-9990);
		list.add(520);
		list.add(499);
		list.add(32);
		list.add(2000009);
		System.out.println("The second highest number is -> " +secondHighest(list));
		

	}

}
