import java.awt.event.*;

import acm.graphics.*;
import acm.program.*;

public class midterm2022problem1 extends ConsoleProgram {
	private GLine curLine = null;
	private GPoint lastPoint = new GPoint(0, 0);
	
	public void run () {
		println(stringToInt("14") + 1);
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
