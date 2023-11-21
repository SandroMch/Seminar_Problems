import acm.program.*;

public class problem49 extends ConsoleProgram {
	public void run() {
		String number = readLine("Enter number: ");
		int num = StringToInt(number);
		if(checkString(number)) {
			println(num);
		} else {
			println("You must put numbers");
		}
	}

	private int StringToInt(String number) {
		int num = 0;
		for (int i = 0; i < number.length(); i++) {
			char currNum = number.charAt(i);
			int currDigit = currNum - '0';
			num = num * 10 + currDigit;
		}
		return num;
	}
	private boolean checkString(String number) {
		int num = 0;
		for(int i = 0; i < number.length(); i++) {
			char currNum = number.charAt(i);
			int currDigit = currNum - '0';
			num += currDigit;
		}
		if(num >= 0 && num <= 9) {
			return true;
		}
		return false;
	}
}
