import java.awt.event.*;
import java.util.StringTokenizer;

import acm.graphics.*;
import acm.program.*;

public class midterm2022problem1 extends ConsoleProgram {
	private GLine curLine = null;
	private GPoint lastPoint = new GPoint(0, 0);
	
	public void run () {
		String a = "15 + 30 - 12";
		
		StringTokenizer tokenizer = new StringTokenizer(a, " ");
		int ans = stringToInt(tokenizer.nextToken());

		while(tokenizer.hasMoreTokens()) {
			String str = tokenizer.nextToken();
			if (str.equals("+")) {
				ans += stringToInt(tokenizer.nextToken());
			} else if (str.equals("-")) {
				ans -= stringToInt(tokenizer.nextToken());
			}
		}
		println(ans);
	}
	
	private int stringToInt(String a) {
		int ans = 0;
		for (int i = 0; i < a.length(); i++) {
			ans *= 10;
			ans += a.charAt(i) - '0';
		}
		return ans;
	}
	
}
