package strings;

public class StringBufferAndBuilder {
	
	public static void stringBuffer() {
		
		StringBuffer sbf = new StringBuffer("Hello");
		StringBuffer res = sbf.append("Hi");
		System.out.println(sbf);
		System.out.println(res);
		
	}
	
	public static void stringconcat() {
		String str = "Hi";
		String res = str+100;
		System.out.println(res);
		System.out.println(str);//String is immutable
		
		
	}
	
public static void stringBuilder() {
		
		StringBuilder sb = new StringBuilder("Hello");
		StringBuilder res = sb.append("Hi");
		System.out.println(sb);
		System.out.println(res);
		
	}

	public static void main(String[] args) {
		stringBuffer();
		stringconcat();
		stringBuilder();
	}

}
