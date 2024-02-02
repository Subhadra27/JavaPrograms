package basics;
public class Vimp_CheckLeapYear {
	
	public static boolean toCheckLeapYear(int year) {		
		boolean isLeapYear ;
		if(year%400==0) {
			
			isLeapYear = true;
			
			
			
		}else if(year%100 ==0) {
			 isLeapYear =false;
			
		}else if(year%4==0) {
			isLeapYear = true;
			
		}else {
				isLeapYear = false;
		}
		return isLeapYear;
				
	}
	


	public static void main(String[] args) {
		System.out.println("The year is a leap year  2000? " +toCheckLeapYear(2000));
		System.out.println("The year is a leap year 1997 ? "  +toCheckLeapYear(1997));
		System.out.println("The year is a leap year 1996 ? "  +toCheckLeapYear(1996));
		System.out.println("The year is a leap year 2100 ? "  +toCheckLeapYear(2100));
		
		System.out.println(" ---- ");
		
			
	}

}
