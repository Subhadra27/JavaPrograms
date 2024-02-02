///*Find the Index of the First Occurrence in a String
//*/
//package strings;
//
//public class FindFirstOccurance {
//	
//	public static int firstOccurance(String haystack, String needle) {
//		if(haystack.contains(needle)) {
//			return ( haystack.indexOf(needle));	
//		}
//		return -1;	
//	}
//	
//	public static int firstOccuranceSubSTring(String haystack, String needle) {
//		for(int i = 0; i<haystack.length() ;i++ ) {
//			//d = len(needle);
////			if(haystack.substring(i, i+d).equals(needle)) {
////				return i;
//			}
//			
//		}
//		return -1;	
//	}
//
//	public static void main(String[] args) {
//		String haystack = "corporate";
//		String needle = "or";
//		System.out.println(firstOccurance(haystack,needle));
//		//System.out.println(firstOccuranceSubSTring(haystack,needle));
//
//	}
//
//}
