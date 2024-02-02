package arrayPrograms;

public class DecrementOfArray {
	int current;

	public void decrementArray(int array[]) {
		int num =0;
		
		for(int i : array) {
			
			 num= (i-1);
			System.out.print(" " +num);
			
		}
		
		
	
		
	}
	public static void main(String[] args) {
		DecrementOfArray obj = new DecrementOfArray();
		int array1[] = {2,3};
		obj.decrementArray(array1);	
		
	}

}
