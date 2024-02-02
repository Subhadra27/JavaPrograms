package arrayPrograms;

public class ArraySearch {
	
	public static void arraySearch(int arr[],int num) {
		for(int i :arr) {
			if(i == num) {
				System.out.println("The number which is present array is -> " + i);
				break;
				
			}
			
		}
		
	}

	public static void main(String[] args) {
		int input[] = {21,12,23,5,6,5};
		int intg = 5;
		arraySearch(input,intg);

	}

}
