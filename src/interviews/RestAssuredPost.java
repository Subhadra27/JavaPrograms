//package interviews;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class RestAssuredPost {
//	private String username;
//	private String pwd;
//	private String basurl ="";
//	Response response;
//	
//	public  void postCall(String username,String pwd) {
//		this.username = username;
//		this.pwd = pwd;
//		RequestSpecfication request = RestAssured.given();
//		request.baseUri(basurl);
//		request.header("Authrization",Bearer+token).header("content-type", "application/json");
//		 JsonObject user = new JsonObject();
//		 user.put("username",username);
//		 user.put("password",pwd);
//		 
//		 response = request.body(user.toString()).post("end url");
//		 String statusCode = response.statusCode();
//		 assertTrue(201,statusCode);
//		 
//		 JsonPath jpath = response.jsonPath();
//		 String usrename = jpath.get("username");
//		
//	}
//	
//	/*Given username <username> and password <pwd> to login*/
//	
//	@Given(username "^(+.)$") and password ^(+.)$) to login)
//	public void userInputs(String userName,String password) {
//		@cucumberOptions(features ="path of feature file",
//						glue = "stepDefinition fold name",
//						pretty{plugin :"html\\target\report.html"}
//				)
//		
//		public static void entrySet(HashMap<String,Integer> hmap) {
//			for(Map.Entry<String,Integer> entry :hmap.entrySet()) {
//				String key = entry.getKey();
//				int value = entry.getValue();
//				
//			}System.out.println();
//			
//		}
//		
//		
//	}
//	
//
//	public static void main(String[] args) {
//		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
//		hmap.put("Hi", 1);
//		hmap.put("Hi", 1);
//		hmap.put("Hello", 1);
//				
//		entrySet()
//		// TODO Auto-generated method stub
//
//	}
//
//}
