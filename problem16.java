import acm.program.*;

public class problem16 extends ConsoleProgram {
	public void run() {
		println("Find Middle Harmonic");
		findMeanHarmonic();
	
	}
	
	private void findMeanHarmonic() {
		double A = readInt ("First Number: ");
		double B = readInt ("Second Number: ");
		double C = readInt ("Third Number: ");
		
		double upsideA = 1/A;
		double upsideB = 1/B;
		double upsideC = 1/C;
		double sumOfDenominator = upsideA + upsideB + upsideC;
		double middleHarmonic = 1/sumOfDenominator;
		
		println(middleHarmonic);
	}
	
}
