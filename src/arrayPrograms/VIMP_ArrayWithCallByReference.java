package arrayPrograms;

import java.util.Arrays;

public class VIMP_ArrayWithCallByReference {
	
	public static int sum(int a ,int b) {
		System.out.println("a "+ System.identityHashCode(a));
		System.out.println("b "+ System.identityHashCode(b));
		int p =10;
		System.out.println("p "+ System.identityHashCode(p));
		return a+b;
		
		
		
	}
	
	public  void multiplyTwo(int arr[]) {
		VIMP_ArrayWithCallByReference.sum(20,12);
		int res = 0;
		for(int i = 0 ;i < arr.length;i++) {
			 arr[i] = arr[i] * 2;			 		
		}
		System.out.println(arr);
	}
	
	public static int[] multiplyTwoOther(int arr[]) {
		
		int res[] = new int[arr.length] ;
		for(int i = 0 ;i < arr.length;i++) {
			 res[i] = arr[i] * 2;			 		
		}
		return res;
}

	public static void main(String[] args) {
		int input[] = {2,5,6,10};
		System.out.println(input);
//		multiplyTwo(input);
//		String output =Arrays.toString(input);
//		System.out.println(input);
//		System.out.println(output);
		
		int outputOther[] = multiplyTwoOther(input);
		System.out.println(outputOther);
		String res =Arrays.toString(outputOther);
		System.out.println(res);
		
		int x = 10;
		int z1 = 20;
		int t = 30;
		int u = 50;
		int w = 17;
		int y = 10;
		System.out.println("x "+ System.identityHashCode(x));
		System.out.println("y "+ System.identityHashCode(y));
		int z = sum(x,y);
		
		

	}

}
