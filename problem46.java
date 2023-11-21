import acm.program.ConsoleProgram;

public class problem46 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		println(commonChar(text));
	}

	private int countChar(String text, char ch) {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			char symbol = text.charAt(i);
			if (symbol == ch) {
				count++;
			}
		}
		return count;
	}

	private char commonChar(String text) {
		char result = ' ';
		int charCount = 0;
		for (int i = 0; i < text.length(); i++) {
			char currChar = text.charAt(i);
			int numberOfChar = countChar(text, currChar);
			
			
			if (numberOfChar > charCount) {
				numberOfChar = charCount;
				result = currChar;
			}
		}
		return result;
	}
}
