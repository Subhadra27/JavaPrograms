package strings;

public class SwappingStringsWithout3RdString {
	
	public static void swappingStringsWithout3RdString(String input1 , String input2) {
		
		 System.out.println("Before swapping 2 numbers are "+ input1+"," + input2);
		 input1 = input1+input2;
		 input2=input1.substring(0,input1.length()-input2.length());
		 input1 = input1.substring(input2.length(),0);//0 is optional
		 
		 System.out.println("After swapping 2 numbers are "+ input1+","  + input2);		
	}

	public static void main(String[] args) {
		String str1 , str2;
		str1 ="abc";
		str2 ="de";
		swappingStringsWithout3RdString(str1,str2);

	}

}
