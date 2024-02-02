package arrayPrograms;

public class TwoDimensionArray {
	
	public static void twoDArray(int arr[][]) {		
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				//arr[i][j]= 12;
				System.out.print( arr[i][j]+ " ");
			}
			System.out.println();
		
			
		}	System.out.println(arr.length);
		
	}

	public static void main(String[] args) {
		int arr1[][] = {{2,3,4},{9,0,10,23}};
		twoDArray(arr1);
		
		

	}

}
