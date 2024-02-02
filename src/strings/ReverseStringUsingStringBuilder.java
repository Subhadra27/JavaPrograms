package strings;

public class ReverseStringUsingStringBuilder {

	public static void main(String[] args) {
		String str = "Selenium";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse()); 
	}

}
