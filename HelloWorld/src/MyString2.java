
public class MyString2 {
	private String s;
	
	MyString2(String str){
		s = "";
		for (int i = 0; i < str.length(); i++) {
			s += str.charAt(i) + "";
		}
	}
	
	public int compare(String str) {
		int value = 0;
		if (s.length() < str.length())
			value = -1;
		if (str.length() < s.length())
			value = 1; 
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < str.charAt(i))
				value = -(i + 1);
			if (s.charAt(i) > str.charAt(i))
				value = i + 1;
		}
		return value;
	}
	
	public MyString2 substring(int begin) {
		String newString = "";
		for(int i = begin; i < s.length(); i++) {
			s += s.charAt(i)+"";
		}
		
		return new MyString2(newString);
	}
	
	public MyString2 toUpperCase() {
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
				str += String.valueOf((char)(s.charAt(i) - 32));
			else
				str += String.valueOf(s.charAt(i));
		}
		return new MyString2(str);
	}
	
	public char[] toChars() {
		char[] ch = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			ch[i] = s.charAt(i);
		}
		return ch;
	}
	
	//Returns a boolean as a mystring object
	public static MyString2 valueOf(boolean b) {
		return (b ? new MyString2("true") : new MyString2("false"));
	}
}
