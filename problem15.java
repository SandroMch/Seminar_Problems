import acm.program.*;

public class problem15 extends ConsoleProgram {
	public void run() {
		println("find Mean Arithmetic: ");
		findMeanArithmetical();
	}
	
	private void findMeanArithmetical() {
		int n1 = readInt("first Number :" );
		int n2 = readInt("SecondNumber :" );
		int total = n1 + n2;
		double meanArithmetical = (double)(total)/2;
		println(meanArithmetical);
	}
}
