import acm.program.*;

public class problem45 extends ConsoleProgram {
	private String text;
	private String ch;
	private int c;
	public void run() {
		text = readLine("Enter text: ");
		ch = readLine("Enter character: ");
		println(compareStrings());
	}
	private int compareStrings() {
		c = 0;
		for(int i = 0; i < text.length(); i++) {
			if(ch.equals(text.charAt(i))) {
				c += 1;
			}
		}
		return c;
	}
}
