import acm.program.ConsoleProgram;

public class Midterm_practice extends ConsoleProgram {
	public void run() {
		String input = readLine();
		
		for (int i = 0; i < input.length(); i++) {
			char currChar = input.charAt(i);
			
			int n = countChar(input, currChar);
		}
	}
	
	private int countChar(String input, char currChar) {
		
	}
}
