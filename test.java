import acm.program.*;

public class test extends ConsoleProgram {
	public void run() {
		String s = readLine();
		println(countLastWord(s));
	}

	private int countLastWord(String s) {
		int count = 0;
		char space = ' ';
		for (int i = (s.length() - 1); i > 0; i--) {
			while(s.charAt(i) != space) {
				count++;
			}
			
		}
		return -1;
	}
}
