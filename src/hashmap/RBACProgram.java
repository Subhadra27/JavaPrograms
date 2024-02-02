/*Given a role ,fetch the user credentials-> String 
 * credentials 
 * */


package hashmap;

import java.util.HashMap;
public class RBACProgram {
	
	public static String getCreds(String role) {
		HashMap<String,String> usermap = new HashMap<String,String>();
		usermap.put("admin", "admin1,admin@123");
		usermap.put("seller", "seller,seller@123");
		usermap.put("manager", "manager,manager@123");
		
		return usermap.get(role);		
	}
	
	public static void doLogin(String un, String pwd) {
		System.out.println("Login with "+un +": "+ pwd);		
	}

	public static void main(String[] args) {
		String adminCreds = getCreds("admin");
		String sellerCreds = getCreds("seller");
		String managerCreds = getCreds("manager");
		System.out.println("The user name and password are " + adminCreds);
		String userName = adminCreds.split(",")[0];
		String password = adminCreds.split(",")[1];
		doLogin(userName,password);
	}

}
