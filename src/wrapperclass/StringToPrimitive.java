package wrapperclass;

public class StringToPrimitive {
	
	public static int stringToInt(String str) {
		
		System.out.println(str +"->"+ str.getClass());
		int value = Integer.parseInt(str);
		System.out.println(value);
		
		return value;
	}
	public static double stringToDuble(String str) {
			
			System.out.println(str +"->"+ str.getClass());
			double value = Double.parseDouble(str);
			
			
			return value;
		}

	public static void main(String[] args) {
		try{
			stringToInt("100.98");
		}catch(NumberFormatException e) {
			//System.out.println("NumberFormatException handled");
			
		}
		
		double output = stringToDuble("110.21");
		System.out.println(output);
		

	}

}
