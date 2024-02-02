package basics;

public class SwappingTwoNumbersWithout3RdNumber {
	public static void swappingTwoNumbersWithout3RdNumber(int x,int y) {
		x= x+y;
		y=x-y;
		x=x-y;
		System.out.println("The numbers after swapping " + x +", "+y);
		
		
	}
	

	public static void main(String[] args) {
		swappingTwoNumbersWithout3RdNumber(5,10);

	}

}
