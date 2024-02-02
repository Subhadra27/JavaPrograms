package arrayPrograms;

public class AverageOfElements {
	
	public void averageOfElements() {
		int array[] = {	20,23,0,12,34};
		int sum =0;
		int avg = 0;
		for(int i :array) {
			sum=sum+i ;
			
		}
		avg = sum/(array.length);
		
		System.out.println("The average of all elements of above array is:-> "+ avg );
		
		}

	public static void main(String[] args) {
		AverageOfElements obj = new AverageOfElements();
		obj.averageOfElements();

	}

}
