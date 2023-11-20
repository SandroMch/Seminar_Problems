import acm.program.ConsoleProgram;

public class LeetCode_remove_duplicates extends ConsoleProgram {
	public void run () {
		String input = readLine("Enter Text : ");
		println(removeDuplicates(input));
	}
	
	private String removeDuplicates(String input) {
		input.trim();
		
		String answer = input.charAt(0);
		
		for (int i = 0; i < input.length(); i++) {
			
		}
		
		return answer;
	}
	
}	
