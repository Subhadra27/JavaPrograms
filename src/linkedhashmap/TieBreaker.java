package linkedhashmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TieBreaker {

	public static String electedCandidate(String inputs[]) {
		LinkedHashMap<String, Integer> hmap = new LinkedHashMap<String, Integer>();
		int maxValueInMap = 0;
        String winner = "";
		for (String input : inputs) {
			if (!hmap.containsKey(input)) {
				hmap.put(input, 1);
			} else {
				hmap.put(input, hmap.get(input) + 1);
			}
		}
		
		for (Map.Entry<String, Integer> entry : hmap.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			if (val > maxValueInMap) {
				maxValueInMap = val;
				winner = key;
			}

		}
		return winner;

	}

	public static void main(String[] args) {

		String candidates[] = { "Shrikant", "Brajesh" ,"Sushma", "Rajnath", "Sushma","Brajesh"};
		System.out.println(electedCandidate(candidates));

	}

}
