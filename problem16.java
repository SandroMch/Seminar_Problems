import acm.program.*;

public class problem16 extends ConsoleProgram {
	public void run() {
		int A = readInt ("First Number: ");
		int B = readInt ("Second Number: ");
		int C = readInt ("Third Number: ");
		
		int upsideA = 1/A;
		int upsideB = 1/B;
		int upsideC = 1/C;
		
		int middleHarmonic = upsideA + upsideB + upsideC;
		println(middleHarmonic);
		
	
	}
}
