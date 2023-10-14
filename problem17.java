import acm.program.*;

public class problem17 extends ConsoleProgram {
	public void run() {
		double n = readDouble("Enter real number: ");
		int a = (int) n;
		println("Whole part of the number is: "+ a );
		
		double b = n - a;
		println("Decimal part of the number is: " + b);
	}
}
