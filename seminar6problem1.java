import acm.program.*;

public class seminar6problem1 extends ConsoleProgram {
	private static final int SENTINEL = 0;
	public void run() {
		double sum = 0;
		while(true) {
			double a = readDouble("Enter number: ");
			if(a == SENTINEL) {
				break;
			} else {
				sum = sum + a;
			}
		}
		println(sum);
	}
}
