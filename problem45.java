import acm.program.*;

public class problem45 extends ConsoleProgram {

	public void run() {
		String text = readLine("Enter text: ");
		char symbol = readLine("Enter symbol: ").charAt(0);
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (symbol == text.charAt(i)) {
				count++;
			}
		}
		println("Symbol quantity is: " + count);
	}
}
