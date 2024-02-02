package arrayList;

import java.io.*;
import java.util.ArrayList;

public class ArrayListSerialization implements Serializable {
	
	public static void arrayListSerilization(ArrayList<String> inputList , String fileName) {
		try {
			// Step 1: Open a file output stream to create a file object on disk.
			// This file object will be used to write the serialized bytes of an object
			FileOutputStream fileStream = new FileOutputStream(fileName); 
			// Step 2: Create a ObjectOutputStream, this class takes a files stream.
			// This class is responsible for converting the Object of any type into
			// a byte stream
			ObjectOutputStream objStream = new ObjectOutputStream(fileStream);
			// Step 3: ObjectOutputStream.writeObject method takes an Object and 
			// converts it into a ByteStream. Then it writes the Byte stream into
			// the file using the File stream that we created in step 1.
			objStream.writeObject(inputList);
			//Close the streams
			objStream.close();
			fileStream.close();			
		}  catch (FileNotFoundException e) {			
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}	
		
	}

	public static void main(String[] args) {
		ArrayList<String>  arrList = new ArrayList<String> ();
		
		 arrList.add("array");
		arrList.add("String");
		arrList.add("array list");
		arrList.add("String array");
		
		arrayListSerilization(arrList , "arr_file.txt");

	}

}
