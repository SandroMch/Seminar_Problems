import acm.program.*;

public class problem48 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		commonSymbol(text);
	}

	private void commonSymbol(String text) {
		for (int i = 0; i < text.length(); i++) {
			char currChar = text.charAt(i);
			int countSymbol = countSymbols(text, currChar);
			println(currChar + " :" +  countSymbol);
		}
	}

	private int countSymbols(String text, char ch) {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (ch == text.charAt(i)) {
				count++;
			}
		}
		return count;
	}
}
