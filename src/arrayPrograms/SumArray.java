package arrayPrograms;

public class SumArray {
	
	public void sumArray() {
		int array[] = {	20,-98,0,12,34};
		int sum =0;
		for(int i :array) {
			sum=sum+i ;
		}
		
		System.out.println("The sum of all elements of above array is:-"+ sum);
		
		
	}

	public static void main(String[] args) {
		SumArray obj = new SumArray();
		obj.sumArray();

	}

}
