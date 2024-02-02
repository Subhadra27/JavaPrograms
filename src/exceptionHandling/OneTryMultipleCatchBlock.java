package exceptionHandling;

public class OneTryMultipleCatchBlock {
	private int temp;
	//static int value ;
	
	public static void tryCatchBlock() {
		int arr[] = {20,12,78,12,90};	
		//int temp = 100;
		try{
			
			OneTryMultipleCatchBlock obj = new OneTryMultipleCatchBlock();
			obj = null;
			obj.temp = 50;
			 int value = arr[5];
			 System.out.println(value);
			 
		}catch(ArrayIndexOutOfBoundsException e) {
			String errorMessage = e.getMessage();
			System.out.println(errorMessage);			
			e.printStackTrace();
			
		}catch(NullPointerException n) {
			n.printStackTrace();
			
		}
				
	}
	public static void main(String[] args) {
		tryCatchBlock();
	}

}
