package strings;

public class WrongIsStringBalanced {
	
	public static  boolean isBalanced(String symbols) {
		
		for(int i =0;i<symbols.length()/2;i++) {
			if(symbols.charAt(i)+"" == symbols.charAt(symbols.length()-1-i)+"") {
				return true;
				
			}
			
			
		}
		return false;
		
	}

	public static void main(String[] args) {
		System.out.println(isBalanced("({})"));
		// TODO Auto-generated method stub

	}

}
