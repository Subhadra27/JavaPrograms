package basics;

import java.util.ArrayList;

public class FibonaciiSeries {
	public static ArrayList<Integer> fibonaciiSeries(int n) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int n1 = 1;
		int n2 = 2;
		int n3;
		arr.add(n1);
		arr.add(n2);
		
		for(int i = 2; i <= n; i++) {
			n3 = n1 + n2;
			arr.add(n3);
			n1 = n2;
			n2 = n3;
			
		
		}
		return arr;
		
	}

	public static void main(String[] args) {
		System.out.println(fibonaciiSeries(5));

	}

}
