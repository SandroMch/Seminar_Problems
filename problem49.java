import acm.program.*;

public class problem49 extends ConsoleProgram {
	public void run() {
		String numbers = readLine("Enter numbers: ");
		stringToNumber(numbers);
	}

	private int stringToNumber(String numbers) {
		int number = 0;
		char zero = '0';
		for (int i = 0; i <numbers.length(); i++) {
			number = numbers.charAt(i) - zero;
		}
		return number;
	}
	
}
