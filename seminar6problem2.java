import acm.program.*;

public class seminar6problem2 extends ConsoleProgram {
	public void run() {
		double a = readDouble("Enter first number: ");
		double b = readDouble("Enter second number: ");
		String symbolOne = readLine("Enter symbol: ");
		double plus = a + b;
		double minus = a - b;
		double multiplication = a * b;
		double devide = a / b;
		if(symbolOne.equals("+")) {
			println(plus);
		} else {
			if(symbolOne.equals("-")) {
				println(minus);
			} else {
				if(symbolOne.equals("*")) {
					println(multiplication);
				} else {
					println(devide);
				}
			}
		}
	}
}
