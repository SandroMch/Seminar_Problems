import acm.program.*;

public class midterm4 extends ConsoleProgram {
	public void run() {
		String str = readLine("Enter text: ");
		println(reverse(str));

	}

	private String reverse(String str) {
		String reverse = "";
		int lngth = str.length() - 1;
		for (int i = lngth; i >= 0; i--) {
			reverse += str.charAt(i);

		}
		return reverse;
	}
}
