import java.util.StringTokenizer;

import acm.program.*;

public class midterm3 extends ConsoleProgram {

	public void run() {
		while (true) {
			String str = readLine("Enter text: ");
			println(upperCase(str));
		}
	}

	private String upperCase(String str) {
		StringTokenizer tokenizer = new StringTokenizer(str);
		String newStr = "";
		while (tokenizer.hasMoreTokens()) {
			String currToken = tokenizer.nextToken();
			if (currToken.length() == 1) {
				newStr = currToken.substring(0, 1).toUpperCase();
			} else {
				newStr = currToken.substring(0, 1).toUpperCase() + currToken.substring(1).toLowerCase();
			}
			return newStr += currToken;
		}
		return newStr;
	}
}
