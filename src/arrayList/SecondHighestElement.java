package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SecondHighestElement {
	
	public static int secondHighest(ArrayList<Integer> inputs) {		
		/*int res =0;
		for(int i=0;i<inputs.size();i++) {
			for(int j=0;j<inputs.size()-1-i;j++) {
				if(inputs.get(j)>inputs.get(j+1)) {
					int temp = inputs.get(j);
					inputs.get(j)=inputs.get(j+1);
					inputs.get(j+1)=temp;						
				}		
				
			}
			res= inputs.get(inputs.size()-2);
		}
	
		return res;*/		
		Collections.sort(inputs);
		int res= inputs.get(inputs.size()-2);
		return res;		
	}

	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(20);
		arrList.add(12);
		arrList.add(8);
		arrList.add(50);
		arrList.add(1);
		System.out.println(secondHighest(arrList));
		

	}

}
