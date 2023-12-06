import acm.program.*;

public class forpractice extends ConsoleProgram {
	public void run() {
		String str = "Sandro";
		char letter = 'm';
		int n = str.indexOf('n');
		char removedChar = str.charAt(n);
		str = str.replace(removedChar, letter);
		println(str);
	}
	
}
