package arrayPrograms;

public class IfLessThanArrayElements {
	
	public static void compare(int num) {
	
		int arr[] = {23,12,78,-87};
		
		for(int i=0;i<arr.length;i++) {
			if(num>arr[i]) {
			
				System.out.print(" " + arr[i]);
			}		
		}
		System.out.println("The above numbers are lesser than num " );
		
		
	}

	public static void main(String[] args) {
		IfLessThanArrayElements obj = new IfLessThanArrayElements();
		obj.compare(9);

	}

}
