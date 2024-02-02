package hashmap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*public class CountNumberOfWOrds {
	static void CountWords(String filename, Map<String, Integer> words) throws FileNotFoundException {
		Scanner file = new Scanner(new File(filename));
		while (file.hasNext()) {
			String word = file.next();
			Integer count = words.get(word);
			if (count != null)
				count++;
			else
				count = 1;
			words.put(word, count);
		}
		file.close();
	}

	public static void main(String[] args) throws FileNotFoundException {
		Map<String, Integer> words = new HashMap<String, Integer>();
		CountWords("shubham.txt", words);
		System.out.println(words);
	}
}*/

public class VIMP_CountNumberOfWords {
	public static HashMap<String,Integer> countWords(String inputs) {
		
		String split_inp[]= inputs.split(" ");
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		for(String str: split_inp) {
			if(!hmap.containsKey(str)) {
				hmap.put(str, 1);						
			}
			else {
				hmap.put(str,hmap.get(str)+1);			
		}
	}
		return hmap;
	
	}
	
	public static void main(String args[]) {
		String input= "Apple Orange Apple Orange Banana Orange";
		System.out.println(countWords(input));
		
		
		
	}
}


