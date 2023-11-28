import acm.program.ConsoleProgram;

public class test extends ConsoleProgram {
	public void run() {
		String s = readLine();
		println(lengthOfLastWord(s));
	}
	private int lengthOfLastWord(String s) {
        int letterCount = 0;
        char space = ' ';
        for(int i = s.length() - 1; i > 0; i--) {
           char currChar = s.charAt(i);
           while(currChar != space) {
               letterCount++;
           }
           return letterCount;
       }
		return -1;
    }
}
