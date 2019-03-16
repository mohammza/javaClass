
public class MorseCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "H e l l o   w o r l d";
		String morse = Encoder(str.toLowerCase());
		String morse2 = Decoder(
		". . . . . . ___ . . . ___ . . ___ ___ ___   . ___ ___ ___ ___ ___ . ___ . . ___ . . ___ . . ");
		
		System.out.println(morse);
		System.out.println(morse2);
	}

	
	public static String Decoder(String str) {
		//char[] str_arr = str.toCharArray();
		char[] letters = { ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 
				'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };	
		String[] morseLetters = { "    ", ". ___", "___ . . .", "___ . ___ .", "___ . .", ".", ". . ___ .", "___ ___ .", ". . . .", ". .", 
				". ___ ___ ___", "___ . ___", ". ___ . .",  "___ ___", "___ .", "___ ___ ___", ". ___ ___ .", "___ ___ . ___", ". ___ .", 
				". . .", "_", ". . ___", ". . . ___", ". ___ ___", "___ . . ___", "___ . ___ ___", "___ ___ . .", ". ___ ___ ___ ___", 
				". . ___ ___ ___", ". . . ___ ___", ". . . . ___", 
				". . . . .", "___ . . . .", "___ ___ . . .", "___ ___ ___ . .", "___ ___ ___ ___ .", "___ ___ ___ ___ ___"};
		
		String space = "   ";
		StringBuilder expression = new StringBuilder(); //for reading in char by char
		StringBuilder newStr = new StringBuilder();
		int index = -1;
		int i = 0;
		while(i < str.length()) {
			if() {
					for(int j = 0; j < morseLetters.length; j++) {
						if(morseLetters[j].equals(expression)) {
							index = j;
							break;
						}
					}
					expression.setLength(0); //clears the string;
					newStr.append(letters[index]);
					i += 3;
			}
			else {
				expression.append(str.charAt(i));
				i++;
			}
		}
		
		return newStr.toString();
	}
	
	public static String Encoder(String str) {
		char[] str_arr = str.toCharArray();
		char[] letters = { ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 
				'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };	
		String letters_str = new String(letters);
		String[] morseLetters = { "    ", ". ___", "___ . . .", "___ . ___ .", "___ . .", ".", ". . ___ .", "___ ___ .", ". . . .", ". .", 
				". ___ ___ ___", "___ . ___", ". ___ . .",  "___ ___", "___ .", "___ ___ ___", ". ___ ___ .", "___ ___ . ___", ". ___ .", 
				". . .", "_", ". . ___", ". . . ___", ". ___ ___", "___ . . ___", "___ . ___ ___", "___ ___ . .", ". ___ ___ ___ ___", 
				". . ___ ___ ___", ". . . ___ ___", ". . . . ___", 
				". . . . .", "___ . . . .", "___ ___ . . .", "___ ___ ___ . .", "___ ___ ___ ___ .", "___ ___ ___ ___ ___"};
	
		int index;
		StringBuilder newStr = new StringBuilder();
		for(int i = 0; i < str_arr.length; i++) {
			index = letters_str.indexOf(str_arr[i]);
			newStr.append(morseLetters[index]);
			newStr.append(" ");
		}
		//Runtime: O(n);
		
		return newStr.toString();
	}
	
}
