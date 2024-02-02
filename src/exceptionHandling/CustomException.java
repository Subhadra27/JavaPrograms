package exceptionHandling;

public class CustomException {
	
	public static void customException(int age) {
		if(age < 18) {
			throw new CustomExceptionUsingThrow("You are not elligible to get the admission");
			
		}
		else {
			System.out.println("You are elligible for the admission");
		}
		
	}

	public static void main(String[] args) {
		customException(15);

	}

}
