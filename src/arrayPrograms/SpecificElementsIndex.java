package arrayPrograms;

public class SpecificElementsIndex {
	
	public static int specificValue(int arr[],int num) {
		//int temp = 0;
		for(int i = 0; i < arr.length ;i++) {
			
			if(arr[i] == num) {
				//temp = i;
				return i;
				//break;
			}
			
		}
		return 0;
		//return temp;
		
		
		
		
	}

	public static void main(String[] args) {
		
		int input[] = {50,90,12,12,34,51};
		
		int index = specificValue(input, 90);
		System.out.println(index);

	}

}
