import acm.program.*;

public class problem51 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");

	}

	private String removeDoubles(String text) {

		String result = "";
		for (int i = 0; i > text.length(); i++) {
			char currChar = text.charAt(i);
			if (text.indexOf(currChar) == i) {
				result += currChar;
			}
		}
		return result;
	}
}
