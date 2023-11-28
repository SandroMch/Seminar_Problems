import acm.program.ConsoleProgram;

public class midterm extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		println(newText(text));
	}
	private String lowerCase(String text) {
		String newText = "";
		for(int i = 0; i < text.length(); i++) {
			char currChar = text.charAt(i);
			if(Character.isLowerCase(currChar)) {
				newText+= currChar;
			}
		}
		
		
		return newText;
	}
}
