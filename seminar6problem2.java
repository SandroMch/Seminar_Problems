import acm.program.*;

public class seminar6problem2 extends ConsoleProgram {
	public void run() {
		double a = readDouble("Enter first number: ");
		double b = readDouble("Enter second number: ");
		String symbolOne = "+";
		double plus = a + b;
		double minus = a - b;
		double multiplication = a * b;
		double devide = a / b;
		if(symbolOne == ("+")) {
			println(plus);
		}
	}
}
