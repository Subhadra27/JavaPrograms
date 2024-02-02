package oopInterface;

public class FortisHospital extends Medical implements USMedical ,UKMedical,IndianMedical{
	
	int  Fee_Charge = 300;

	@Override
	public void pediaServices() {
		System.out.println("pedia services");
		
	}

	@Override
	public void orthoSerivces() {
		System.out.println("Ortho services");
	}

	@Override
	public void entServices() {
		System.out.println("ENT services");
		
	}

	@Override
	public void eyeServices() {
		System.out.println("pedia services");
	}

	@Override
	public void phyioServices() {
		System.out.println("Phyio services");
		
	}

	@Override
	public void gynoServices() {
		System.out.println("Gyno services");
		
	}

	@Override
	public void managementServices() {
		System.out.println("management services");
		
	}
	
	public void medicalTrainings() {
		System.out.println("medical trainings");
		
	}
	public void medicalInsurancess() {
		System.out.println("medical insurances");
		
	}
	
	public void RnDUSMedical() {
		System.out.println("US R & D");
	}


}
