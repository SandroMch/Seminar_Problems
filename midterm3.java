import java.util.StringTokenizer;

import acm.program.*;

public class midterm3 extends ConsoleProgram {

	public void run() {
		while (true) {
			String str = readLine("Enter text: ");
			println(oneWord(str));
		}
	}

	private String oneWord(String str) {
		StringTokenizer tokenizer = new StringTokenizer(str);
		String noWord = "";
		while (tokenizer.hasMoreTokens()) {
			String newStr = tokenizer.nextToken();
//			if (noWord.length() != 0) {
//				noWord += ' ';
//			}
			if (newStr.length() == 1) {
				newStr = newStr.substring(0, 1).toUpperCase();
			} else {
				newStr = newStr.substring(0, 1).toUpperCase() + newStr.substring(1).toLowerCase();

			}
			return noWord += newStr;

		}
		return noWord;
	}

}
