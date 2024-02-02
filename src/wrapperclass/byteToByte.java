package wrapperclass;

public class byteToByte {
	
	public static Byte byteToByte(byte input) {
		byte output = Byte.valueOf(input);
		
		return output;
		
	}

	public static void main(String[] args) {
		 Byte result = byteToByte((byte)3);
		 System.out.println(result.getClass());

	}

}
