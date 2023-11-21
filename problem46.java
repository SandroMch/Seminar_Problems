import acm.program.ConsoleProgram;

public class problem46 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		char ch = 0;
		println(commonChar(text,ch));
	}
	private int commonChar(String text, char ch) {
		int count = 0; 
		for(int i = 0; i < text.length(); i++) {
			char symbol = text.charAt(i);
			if (symbol == ch) {
				count++;
			}
		}
		return count;
	}
}
