package oopInterface;

public interface USMedical {
	
	public void pediaServices();
	
	public void orthoSerivces();
	
	public void entServices();
	
	//1.Interface can have static method with body,it can't be overriden.
	public  static void  managementServices() {
		System.out.println("US management");
	}
	//2.Interface can have default method with body and it can be overriden with public method type
	default void RnDUSMedical() {
		System.out.println("US R & D");
	}

}
