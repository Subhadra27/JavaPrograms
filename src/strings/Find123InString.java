package strings;

public class Find123InString {	
	public static int find123(String strNum) {
		int count = 0;
					
			/*if(strNum.charAt(i) =='1' && strNum.charAt(i+1)=='2' && strNum.charAt(i+2) =='3') {
				count++;
				//System.out.println(i);
			}	*/
			
			//System.out.println(strNum.substring(i, i+3));
		for(int i =0 ; i < strNum.length()-2; i++) {
			if(strNum.substring(i, i+3).equals("123")) {
				
				count++;
				
			}
		}
		return count;		
	}
	public static void main(String[] args) {		
		System.out.println(find123("32112312355123"));
	}
}
