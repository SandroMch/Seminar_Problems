import acm.program.*;

public class problem47 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		println(reverse(text));
	}
	private String reverse(String text) {
		text = text.toLowerCase();
		String reverse = " ";
		for(int i = 0; i < text.length(); i++) {
			reverse += text.charAt(i);
		}
		return reverse;
	}
}
