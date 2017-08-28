package ko222gj_assign3;

public class TextAnalyzer {
	
	String text;
	int countChar = 0;
	int countUpperChar = 0;
	int spaceCount = 0;
	int digitCount = 0;
	
	
	public TextAnalyzer(String textIn) {
		text = textIn;
	}

	public int charCount() {
		for (int i = 0; i < text.length(); i++) {
			countChar++;
			
		}
		return countChar;
	}
	
	public int upperCaseCount() {
		for (int i = 0; i < text.length(); i++) {
			if (Character.isUpperCase(text.charAt(i))) {
				countUpperChar++;
			}
		}
		return countUpperChar;
	}
	public int whitespaceCount() {
		for (int i = 0; i < text.length(); i++) {
			if (Character.isWhitespace(text.charAt(i))) {
				spaceCount++;
			}
		}
		return spaceCount;
	}
	public int digitCount() {
		for (int i = 0; i < text.length(); i++) {
			if (Character.isDigit(text.charAt(i))) {
				digitCount++;
			}
		}
		return digitCount;
	}
	public boolean containsChar(char cIn) {
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == cIn) {
				return true;
			}
		}
		return false;
	}
	public boolean containsString(String sIn) {
		if (text.contains(sIn)){
				return true;
		}
	return false;
	}
	
}
