import acm.program.ConsoleProgram;

public class midterm extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		println(biggerSymbols(text));
	}

	private String lowerCase(String text) {
		String newText = "";
		for (int i = 0; i < text.length(); i++) {
			char currChar = text.charAt(i);
			if (Character.isLowerCase(currChar)) {
				newText += currChar;
			}
		}
		return newText;
	}
	private boolean biggerSymbols(String newText) {
		for(int i = 1; i < newText.length(); i++) {
			char ch = newText.charAt(i - 1);
			if(newText.charAt(i) < ch) {
				return false;
			}
		}
		
		return true;
	}
}
