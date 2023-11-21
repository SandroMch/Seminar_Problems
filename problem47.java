import acm.program.*;

public class problem47 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		if(text.equals(reverse(text))) {
			println("Entered text is a palindrom");
		} else {
			println("Entered text is not a palindrom");
		}
	}
	private String reverse(String text) {
		text = text.toLowerCase();
		String reverse = "";
		for(int i = text.length() - 1; i >=0; i--) {
			reverse += text.charAt(i);
		}
		return reverse;
	}
}
