package exceptionHandling;

public class MultipleTryCatchBlocks {	
	public static void multipleTryCtachBlocks() {
		try{
		
		int arr[] = {20,12};
		int res_arr = arr[2];
	}catch(ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();	
	}try{
		int a = 8;		
		int res = a/0;
	}catch(ArithmeticException e) {
		e.printStackTrace();	
	}
}      
        public static void multipleTryBlocks() {
                try{
                int a = 8;                
                int res = a/0;
                int arr[] = {20,12};
                int res_arr = arr[2];
        }catch(ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();        
        }catch(ArithmeticException e) {
                e.printStackTrace();        
        }
}
      

	public static void main(String[] args) {
		//MultipleTryCatchBlocks.multipleTryCtachBlocks();
		MultipleTryCatchBlocks.multipleTryBlocks();
	}
}
