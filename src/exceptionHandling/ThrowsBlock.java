package exceptionHandling;

public class ThrowsBlock {	
	public static void m1() {
		System.out.println("From m1 method");	
		try {
		m2();
	}catch(ArithmeticException e) {
		e.printStackTrace();
	}
	}
	public static void m2() throws ArithmeticException {
		int res = 5/0;
		System.out.println("From m2 method");
	}
	public static void main(String[] args) {
		m1();
	}

}
