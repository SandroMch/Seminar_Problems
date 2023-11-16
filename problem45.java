import acm.program.*;

public class problem45 extends ConsoleProgram {

	public void run() {
		String text = readLine("Enter text: ");
		char symbol = readLine("Enter symbol: ").charAt(0);
		int c = 0;
		for (int i = 0; i < text.length(); i++) {
			if (symbol == text.charAt(i)) {
				c++;
			}
		}
		println(c);
	}
}
