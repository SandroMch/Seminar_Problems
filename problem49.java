import acm.program.*;

public class problem49 extends ConsoleProgram {
	public void run() {
		String number = readLine("Enter number: ");
		int num = StringToInt(number);
		println(num);
	}

	private int StringToInt(String number) {
		int num = 0;
		for(int i = 0; i < number.length(); i++) {
			char currNum = number.charAt(i);
			int currDigit = currNum - '0';
			num = num * 10 + currDigit;
		}
		return num;
	}
}
