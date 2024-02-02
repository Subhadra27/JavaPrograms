package basics;

public class Ex {
	public void m1() {
		System.out.println("Inside m1");
		m2();
	}
	public void m2() {
		System.out.println("Inside m2");
		m1();
	}
	public static void main(String args[]) {
		Ex obj = new Ex();
		obj.m1();
		
	}
}

