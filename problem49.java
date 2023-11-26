import acm.program.*;

public class problem49 extends ConsoleProgram {
	public void run() {
		String numbers = readLine("Enter numbers: ");
		println(stringToNumbers(numbers));
	}
	private int charToInteger(char ch) {
		int number = ch - '0';
		return number;
	}
	private int stringToNumbers(String numbers) {
		int num = 0;
		for(int i = 0; i < numbers.length(); i++) {
			int currChar = charToInteger(numbers.charAt(i));
			num = num * 10 + currChar;
		}
		return num;
	}
}
