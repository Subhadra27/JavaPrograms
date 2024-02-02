package oopInterface;

public class TestClass {

	public static void main(String[] args) {
		FortisHospital obj = new FortisHospital();
		Apollo app = new ApolloDelhi();
		
		obj.managementServices();
		obj.entServices();
		obj.eyeServices();
		obj.gynoServices();
		obj.medicalTrainings();
		obj.medicalInsurancess();
		obj.medicalSystemGlobal();
		
		app.apolloServices();
		USMedical.managementServices();
		//System.out.println(FortisHospital.Fee_Charge);

	}

}
