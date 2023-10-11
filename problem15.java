import acm.program.*;

public class problem15 extends ConsoleProgram {
	public void run() {
		double n1 = readInt("first Number :" );
		double n2 = readInt("SecondNumber :" );
		double total = n1 + n2;
		double arithmeticMiddle = total/2;
		println(arithmeticMiddle);
	}
}
