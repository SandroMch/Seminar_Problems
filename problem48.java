import acm.program.*;

public class problem48 extends ConsoleProgram {
	String text;

	public void run() {
		text = readLine("Enter text: ");
		printSymbols(text);
	}

	private void printSymbols(String text) {
		for(int i = 0; i < text.length(); i++) {
			char currChar = text.charAt(i);
			if(ifAppeared(text, i)) {
				int counted = countSymbols(text,currChar);
				println(currChar + " is" + counted);
						
			}
		}
	}
	private boolean ifAppeared(String text , int index) {
		char ch = text.charAt(index);
		int firstIndex = text.indexOf(ch);
		return firstIndex == ch;
	}

	private int countSymbols(String text, char symbol) {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == symbol) {
				count++;
			}
		}
		return count;
	}
}
