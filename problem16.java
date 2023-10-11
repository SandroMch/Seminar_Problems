import acm.program.*;

public class problem16 extends ConsoleProgram {
	public void run() {
		int A = readInt ("First Number: ");
		int B = readInt ("Second Number: ");
		int C = readInt ("Third Number: ");
		
		int upsideA = A;
		int upsideB = B;
		int upsideC = C;
		
		int middleHarmonic = upsideA + upsideB + upsideC;
		println(middleHarmonic);
		
	
	}
}
