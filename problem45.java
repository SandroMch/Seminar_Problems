import acm.program.*;

public class problem45 extends ConsoleProgram {
	private String text;
	private String ch;
	int c;
	public void run() {
		text = readLine("Enter text: ");
		ch = readLine("Enter character: ");
		compareStrings();
	}
	private void compareStrings() {
		for(int i = 0; i < text.length(); i++) {
			if(ch.equals(text.charAt(i))) {
				c += 1;
			}
		}
		println(c);
	}
}
