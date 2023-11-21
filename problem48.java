import acm.program.*;

public class problem48 extends ConsoleProgram { 
	public void run() {
		String text = readLine("Enter text: ");
		println(findChar(text));
	}
	private String findChar(String text) {
		String symbol = "";
		for(int i = 0; i < text.length(); i++) {
			symbol += text.charAt(i);
		}
		return symbol;
	}
}
