import acm.program.*;

public class problem48 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		countEverySymbol(text);
	}

	private void countEverySymbol(String text) {
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			int count = counterSymbol(text, ch);
			println(ch + ":" + count);
		}
	}
	private boolean findFirstSymbol(String text , int index) {
		if(text.indexOf(text.charAt(index)) == index) {
			return text.indexOf(text.charAt(index)) == index;
		}
		return false;
	}
	

	private int counterSymbol(String text, char symbol) {
		int symbolCount = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == symbol) {
				symbolCount++;
			}
		}
		return symbolCount;
	}
}
