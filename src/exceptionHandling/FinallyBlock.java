package exceptionHandling;

public class FinallyBlock {
	
	public static int finallyBlock(String name) {
		if(name.equals("Ramesh")) {				
		try {
			int i = 9/3;
			System.out.println("From try block");
			return 40;			
//		}catch(ArithmeticException e) {
//			System.out.println("From catch block");
//			return 50;
			
		}finally {
			System.out.println("From finally block");
			return 100;
		}
		}else if(name.equals("Suresh")) {
			System.out.println(name + "Got passed with average mark");
			return 30;
			
		}else {
			System.out.println(name + "Got failed");
			return 20;
			
			
		}
		
	}

	public static void main(String[] args) {
		int output =  finallyBlock("Ramesh");
		System.out.println(output);

	}

}
