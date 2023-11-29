import acm.program.*;

public class midterm4 extends ConsoleProgram {
	public void run() {
		String str = readLine("Enter text: ");
		println(reverse(str));
		
	}
	@SuppressWarnings("unused")
	private String reverse(String str) {
		String newStr = "";
		int lngth = str.length() - 1;
		for(int i = lngth; i > 0; i--) {
			newStr = str.charAt(i) + newStr;
			
		}
		return newStr;
	}
}
