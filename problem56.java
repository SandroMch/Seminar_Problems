

import java.util.Arrays;

import acm.program.*;

public class problem56 extends ConsoleProgram {
	int n;
	public void run() {
		n = readInt("Enter array length: ");
		int[] nums = new int[n];
		for(int i = 0; i < n; i++) {
			nums[i] = readInt("Enter numbers: ");
		}
	}
	
}
