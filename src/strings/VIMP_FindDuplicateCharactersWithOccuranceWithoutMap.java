package strings;

import java.util.Arrays;

/*automation
 * a = 2 t =2 o = 2*/
public class VIMP_FindDuplicateCharactersWithOccuranceWithoutMap {
	
	public static void elementCount(String str) {
		int count[] = new int[256];
		for(int i = 0 ; i < str.length() ; i++) {
			count[(int)(str.charAt(i))]++ ;		
			//System.out.println(Arrays.toString(count));
		}
		
		for(int i = 0 ;i < count.length ; i++) {
			if(count[i] > 1) {
			//if (count[i] != 0) {
				System.out.println((char)i + "->" + count[i]);
			}			
		}		
	}public static void main(String[] args) {
		String input ="automation";
		elementCount(input);
	}
}
