import java.util.Scanner;

/**
 * 
 */

/**
 * @author Hamza
 *
 */
public class SocialSecurity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a SSN: ");
		String ssn = in.next();
		
		boolean isValid = 
				(ssn.length() == 11) && 
				(Character.isDigit(ssn.charAt(0))) &&
				(Character.isDigit(ssn.charAt(1))) &&
				(Character.isDigit(ssn.charAt(2))) &&
				(ssn.charAt(3) == '-') &&
				(Character.isDigit(ssn.charAt(4))) &&
				(Character.isDigit(ssn.charAt(5))) &&
				(Character.isDigit(ssn.charAt(7))) &&
				(ssn.charAt(6) == '-') &&
				(Character.isDigit(ssn.charAt(8))) &&
				(Character.isDigit(ssn.charAt(9))) &&
				(Character.isDigit(ssn.charAt(10)));
		
		if (isValid) {
			System.out.printf("%s is a valid social security number", ssn);
		} else {
			System.out.printf("%s is an invalid social security number", ssn);
		}
		
		//End of Program
		in.close();
	}

}
