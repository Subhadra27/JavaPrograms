package strings;

import java.util.ArrayList;

public class InsertWordAtIndex { 
	public static String modifyString(String input,int index,String word) {
	String inputArray[] = input.split(" ");
	ArrayList<String> arr = new ArrayList<String>();
	
	for(String str:inputArray) {
		arr.add(str);			
	}
	arr.add(index,word);
	String output = String.join(" ", arr);

	return output;	
}

public static void main(String[] args) {
	
	String input = "This is a sample String";
	int index = 3;
	String word = "new";
	
	String res = modifyString(input,index,word);
	System.out.println("The modified String is -> " + res);
	
}

}
