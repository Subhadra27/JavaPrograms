package hashmap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class VIMP_SecondHigestCountInHashMap {
    private static String findSecondHighestOccurrence(Map<String, Integer> nameCountMap) {
        String highestName = null;
        int highestCount = Integer.MIN_VALUE;
               
        String secondHighestName = null;
        int secondHighestCount = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : nameCountMap.entrySet()) {
        	System.out.println(entry.getKey());
            int count = entry.getValue();

            if (count > highestCount) {
                // Shift the highest to second highest
                secondHighestCount = highestCount;
                secondHighestName = highestName;

                // Update the highest
                highestCount = count;
                highestName = entry.getKey();
            } else if(count == highestCount && count!= secondHighestCount) {
            	secondHighestCount =count;
                secondHighestName = entry.getKey();;
            	
            }else if(count == secondHighestCount) {
            	           	
            	
            }
            else if (count > secondHighestCount ) {
                // Update the second highest
                secondHighestCount = count;
                secondHighestName = entry.getKey();
            }
        }  
        return secondHighestName;
    }
    public static void main(String[] args) {
        // Your map
        Map<String, Integer> nameCountMap = new LinkedHashMap<>();
        nameCountMap.put("Mahesh", 5);
        nameCountMap.put("Suresh", 1);
        nameCountMap.put("Sitesh", 2);
        nameCountMap.put("Rupesh", 2);
       

        // Find the second highest occurrence
        String secondHighestName = findSecondHighestOccurrence(nameCountMap);
        
        if (secondHighestName != null) {
            int occurrence = nameCountMap.get(secondHighestName);
            System.out.println("Second highest occurrence: " + secondHighestName + " - " + occurrence + " times");
        } else {
            System.out.println("There is no second highest occurrence in the map.");
        }
    }
}