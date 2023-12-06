import acm.program.*;

public class forpractice extends ConsoleProgram {
	public void run() {
		String str = "Sandro";
		char letter = 'm';
		int n = str.indexOf('n');
		str = str.replace(str.charAt(n), letter);
		println(str);
	}
	
}
