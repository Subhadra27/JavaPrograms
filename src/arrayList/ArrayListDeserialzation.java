package arrayList;

import java.io.*;
import java.util.ArrayList;

public class ArrayListDeserialzation implements Serializable{
	public static ArrayList<String> arrayListDeserialzation(String fileName) {
		ArrayList<String> arrayObject = new ArrayList<String>();
		
		
		try{
			FileInputStream fileStream = new FileInputStream(fileName);
			
			ObjectInputStream objStream = new ObjectInputStream(fileStream);
			System.out.println("ArrayList is desrialized");
		}catch(FileNotFoundException ff) {
			
			
		}catch(IOException ie) {
			
		}
		return arrayObject;
		
	}
	public static void main(String[] args) {
		arrayListDeserialzation("arr_file.txt");

	}

}
