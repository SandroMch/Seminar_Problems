import java.util.StringTokenizer;

import acm.program.*;

public class midterm3 extends ConsoleProgram {
	StringTokenizer tokenizer;

	public void run() {
		while (true) {
			String s = readLine("Enter text: ");
			println(beautify(s));
		}
	}

	private String beautify(String s) {
		StringTokenizer tokenizer = new StringTokenizer(s);
		String beautifulS = "";
		while (tokenizer.hasMoreTokens()) {
			String currentWord = tokenizer.nextToken();
			if(beautifulS.length() != 0){
				beautifulS += ' ';
			}
			
			if (currentWord.length() == 1) {
				currentWord = currentWord.substring(0, 1).toUpperCase();
			} else {
				currentWord = currentWord.substring(0, 1).toUpperCase() 
						+ currentWord.substring(1).toLowerCase();
			}
			
			beautifulS += currentWord;
		}
		return beautifulS;
	}

}
