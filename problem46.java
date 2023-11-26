import acm.program.ConsoleProgram;

public class problem46 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		println("Most common character is: " + commonChar(text));
	}

	private int countLetter(String text, char ch) {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			char symbol = text.charAt(i);
			if (symbol == text.charAt(i)) {
				count++;
			}
		}
		return count;
	}

	private char commonChar(String text) {
		int maxCount = 0;
		char mostCommonChar = 0;
		for (int i = 0; i < text.length(); i++) {
			int charCount = countLetter(text, text.charAt(i));
			if(charCount > maxCount) {
				maxCount = charCount;
				mostCommonChar = text.charAt(i);
			}
		}
		return mostCommonChar;
	}
}
