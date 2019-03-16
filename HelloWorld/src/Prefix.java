import java.util.Scanner;

/**
 * 
 */

/**
 * @author Hamza
 *
 */
public class Prefix {
	public static void main(String[] args) {
		String str1;
		String str2;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the first string: ");
		str1 = in.nextLine();
		System.out.print("Enter the second string: ");
		str2 = in.nextLine();
		
		String prefix = "";
		
		for(int i = 0; i < str1.length() && i < str2.length(); i++) {
			if(str1.charAt(i) == str2.charAt(i))
				prefix += str1.charAt(i);
			else
				break;
		}
		
		if(prefix.length() != 0)
			System.out.println("\"" + prefix + "\" is the common prefix");
		else
			System.out.println("There is no common prefix between " + str1 + " and " + str2);

		in.close();
	}

}
