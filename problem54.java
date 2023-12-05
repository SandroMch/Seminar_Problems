import java.lang.reflect.Array;
import java.util.Arrays;

import acm.program.*;

public class problem54 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter Array length: ");
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = readInt("Enter number: ");
		}
		Arrays.sort(nums);
		println(nums[n - 1]);
		println(nums[n - 2]);

	}
}
