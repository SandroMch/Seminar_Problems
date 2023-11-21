import acm.program.*;

public class problem48 extends ConsoleProgram { 
	public void run() {
		String text = readLine("Enter text: ");
		println(findChar(text));
	}
	private char findChar(String text) {
		char symbol = ' ';
		for(int i = 0; i < text.length(); i++) {
			symbol += text.charAt(i);
		}
		return symbol;
	}
}
