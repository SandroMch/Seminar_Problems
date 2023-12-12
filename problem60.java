import java.util.ArrayList;

import acm.program.*;

public class problem60 extends ConsoleProgram {
	int n;

	public void run() {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		while (n != -1) {
			n = readInt("Enter number: ");
			nums.add(n);
		}
		println(nums);
	}
}
