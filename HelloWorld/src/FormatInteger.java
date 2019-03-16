import java.util.*;

public class FormatInteger {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number, width;
		
		System.out.print("Enter a number: ");
		number = in.nextInt();
		System.out.print("Enter a width: ");
		width = in.nextInt();
		
		
		System.out.println(
				number + " after formatted with width " + width + " is " + format(number,width));
		
		in.close();
	}
	
	public static String format(int number, int width) {
		String num = number + "";
		
		if(num.length() < width) {
			for(int i = width - num.length(); i > 0; i--)
				num = 0 + num;
		}
		
		return num;
	}

}
