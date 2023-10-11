import acm.program.*;

public class problem16 extends ConsoleProgram {
	public void run() {
		int A = readInt ("First Number: ");
		int B = readInt ("Second Number: ");
		int C = readInt ("Third Number: ");
		
		double upsideA = 1/A;
		double upsideB = 1/B;
		double upsideC = 1/C;
		
		double middleHarmonic = upsideA + upsideB + upsideC;
		println(middleHarmonic);
		
	
	}
}
