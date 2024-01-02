import acm.program.*;

public class problem48 extends ConsoleProgram {
	String text;

	public void run() {
		text = readLine("Enter text");
		println(countSymbols(text));
	}

	private int countSymbols(String text) {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			for (int j = 1; j < text.length(); j++) {
				if (text.charAt(i) == text.charAt(j)) {
					count++;
				}
			}
		}
		return count;
	}
}
