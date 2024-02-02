package exceptionHandling;

public class ThrowAndThrows {
	
	public static void test(int age) throws ArithmeticException{
		
		if(age < 18 ) {
			throw new ArithmeticException("Access denied- you must be 18 years");
		}else {
			System.out.println("Access granted");
		}		
	}

	public static void main(String[] args) {
		int age = 17;
		test(age);

	}

}
