import java.util.StringTokenizer;

import acm.program.*;

public class midterm4 extends ConsoleProgram {
	public void run() {
		String str = readLine("Enter text: ");
		println(upsideDown(str));
	}

	private String reverse(String str) {
		String reverse = "";
		int lngth = str.length() - 1;
		for (int i = lngth; i >= 0; i--) {
			reverse += str.charAt(i);

		}
		return reverse;
	}
	private String upsideDown(String str) {
		String finalString = "";
		StringTokenizer tokenizer = new StringTokenizer(str);
		while(tokenizer.hasMoreTokens()) {
			String oneWord = tokenizer.nextToken();
			finalString += reverse(oneWord);
			return finalString;
		}
		return finalString;
	}
}
