package arrayPrograms;

public class VIMP_CheckArraySorting {

    public static  boolean isArraySorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isSorting(int arr[]) {
    	for(int i =1;i<arr.length;i++) {
    		if(arr[i]<arr[i-1]) {
    			return false;   			
    		}
    	}
       	return true;
     }

    public static void main(String[] args) {
        int[] arr1 = {20, 20, 30, 50,50};
       /* boolean isSorting = isArraySorting(arr1);
        System.out.println("Is array sorted? " + isSorting);*/
        
        boolean isSorted = isSorting(arr1);
        System.out.println("Is array sorted?"+ isSorted);
    }
}
