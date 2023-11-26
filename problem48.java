import acm.program.*;

public class problem48 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		commonSymbol(text);
	}
	private int countSymbols(String text , char ch) {
		int count = 0;
		for(int i = 0; i < text.length(); i++) {
			char symbol = text.charAt(i);
			if(symbol == text.charAt(i)) {
				count++;
			}
		}
		return count;
	}
	private void commonSymbol(String text) {
		String ch = "";
		for(int i = 0; i < text.length(); i++) {
			char countedCh = text.charAt(i);
			ch += countedCh;
			println(ch + countSymbols(text , text.charAt(i)));
		}
	}
}
