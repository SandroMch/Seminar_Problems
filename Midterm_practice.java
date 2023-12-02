import acm.program.ConsoleProgram;

public class Midterm_practice extends ConsoleProgram {
	public void run() {
		String input = readLine();
		String answer = "";
		for (int i = 0; i < input.length(); i++) {
			char currChar = input.charAt(i);
			
			int n = countChar(input, currChar, i);
			if (n > 1) {
				answer += n + currChar;
				i += n - 1;
			} else {
				answer += currChar;
			}
		}
		
		println(answer);
	}
	
	private int countChar(String input, char currChar, int i) {
		int answer = 0;
		for (;i < input.length(); i++) {
			if (input.charAt(i) == currChar) {
				answer++;
			} else {
				break;
			}
		}
		return answer;
	}
}
