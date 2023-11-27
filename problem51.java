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
			for(int j = 0; j < text.length(); j++) {
				if(currChar != text.charAt(j)) {
					newText += text.charAt(j);
				}
			}
			return newText;
		}
		return noDoubles;
	}
}
