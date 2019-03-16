import java.util.Scanner;

/**
 * 
 */

/**
 * @author Hamza
 *
 */
public class BirthDay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Variables for user input
		int year; 
		String month; 
		Scanner in = new Scanner(System.in);
		
		//Variables for validation
		String monthW31Days = "Jan Mar May Jul Aug Oct Dec";
        String monthW30Days = "Apr Jun Sep Nov";
        String monthName = "Jan Feb Mar Apr May Jun Jul Aug Sep Oct Nov Dec";

		
		System.out.print("Enter a year: ");
		year = in.nextInt();
		System.out.print("Enter a month: ");
		month = in.next();
		
		
		//Calculating Leap Year
        boolean isLeapYear =
                (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        
        //Output 
        if (month.length() == 3 && Character.isUpperCase(month.charAt(0))
        		&& monthName.contains(month)) {
        	 if (monthW31Days.contains(month)) {
                 System.out.printf("%s %d has 31 days", month, year);
             } else if (monthW30Days.contains(month)) {
                 System.out.printf("%s %d has 30 days", month, year);
             }  else {
                 if (isLeapYear) {
                     System.out.printf("%s %d has 29 days", month, year);
                 }
                 else {
                     System.out.printf("%s %d has 28 days", month, year);
                 }
             }
        	 
        }
        else {
            System.out.printf("%s is not a correct month name", month);
        }
		
        //End of Program
        in.close();
	}

}
