package arrayPrograms;

public class MaxAndMinArrayElement {
	
	public static void maxAndMin(int arr[]) {
		int max = arr[0];
		int min =arr[0];
		
		for(int i = 0;i <= arr.length-1 ; i++ ) {
			if(arr[i] > max) {
				max = arr[i];				
			}else if(arr[i] < min) {
				min = arr[i];
				
			}
			
		}
		
		System.out.println("The greatest element is "+  max);
		System.out.println("The smallest element is "+  min);
		
		
		
	}

	public static void main(String[] args) {
		int input[] = {21,123,90,0,71};
		maxAndMin(input);
		
	}

}
