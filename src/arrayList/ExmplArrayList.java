package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ExmplArrayList {
	public static int secondHigest(ArrayList<Integer> list) {
		if(list.size()<2) {
			System.out.println("Not a correct input");
		}
		Collections.sort(list);
		int num = list.get(list.size()-2);
		return num;
		
	
	
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(27);
		list.add(54);
		list.add(80);
		list.add(70);
		list.add(90);
		int num = secondHigest(list);
		
		System.out.println("The second higest is "+ num);
		

	}

}
