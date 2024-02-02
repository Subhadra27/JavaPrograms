package arrayPrograms;
public class VIMP_LargestElement {	
	public static int largestElement(int arr[]) {
		int temp=arr[0];				
		for (int i=1;i< arr.length;i++) {			
			if(temp<arr[i]) {
				temp = arr[i];
			}
		}
		return temp;
	}	
	public static void main(String args[]) {
		int arr1[] ={-20,0,90,90,80,90};
		int arr2[] ={-12,-12,-15,-20};
		int arr3[] ={5,3,-15,-20};	
		
		int max_element = largestElement(arr1);		
		int max_element1 = largestElement(arr2);		
		int max_element2 = largestElement(arr3);
		
		System.out.println(max_element);
		System.out.println(max_element1);
		System.out.println(max_element2);
		
		
	}
	


}
