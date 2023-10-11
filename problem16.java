import acm.program.*;
public class problem16 extends ConsoleProgram{
	public void run(){
		double a = readDouble("Enter the first number : ");
		double b = readDouble("Enter the second number : ");
		double c = readDouble("Enter the third number : ");
		double ans = harmoniuli(a,b,c);
		println(ans);
	}
	double harmoniuli(double a , double b , double c){
		double t = 1/a + 1/b + 1/c;
		return 1/t;
	}
}
