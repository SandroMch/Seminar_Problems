import java.util.StringTokenizer;

import acm.program.*;

public class midterm3 extends ConsoleProgram {
	StringTokenizer tokenizer;

	public void run() {
		String str = readLine("Enter text: ");
		tokenizer = new StringTokenizer(str);
		println(oneWord(str));
	}

	private String oneWord(String text) {
		String noWord = "";
		while (tokenizer.hasMoreTokens()) {
			String newStr = tokenizer.nextToken();
			if (newStr.length() == 1) {
				newStr = newStr.substring(0, 1).toUpperCase();
				noWord += newStr;
			} else {
				newStr = newStr.substring(0, 1).toUpperCase() + newStr.substring(1);

			}
			return noWord += newStr;

		}
		return noWord;
	}

}
