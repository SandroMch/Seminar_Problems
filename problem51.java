import acm.program.*;

public class problem51 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		println(removeDoubles(text));
	}

	private String removeDoubles(String text) {
		String newText = "";
		String noDoubles = "Your text has no double symbols";
		for (int i = 0; i < text.length(); i++) {
			char currChar = text.charAt(i);
			if (currChar == text.charAt(i + 1)) {
				newText = text.substring(0 , i) + text.substring(i + 1);
				return newText;
			}
		}
		return noDoubles;
	}
}
