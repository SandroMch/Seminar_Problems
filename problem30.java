import acm.program.*;
public class problem30 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter number: ");
		println(reverse(n));
		
	}
	private int reverse(int n) {
		int lastNumber = 0;
		int number = n;
		while(n != 0) {
			lastNumber = n % 10;
			number = number / 10;
			number = number * 10 + lastNumber;
		}
		return number;
	}
}
