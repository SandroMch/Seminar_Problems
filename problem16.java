import acm.program.*;

public class problem16 extends ConsoleProgram {
	public void run() {
		double A = readInt ("First Number: ");
		double B = readInt ("Second Number: ");
		double C = readInt ("Third Number: ");
		
		double upsideA = 1/A;
		double upsideB = 1/B;
		double upsideC = 1/C;
		
		double sumOfUpside = upsideA + upsideB + upsideC;
		println(sumOfUpside);
	
		
	
	}
}
