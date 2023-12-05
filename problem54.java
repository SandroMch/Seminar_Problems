import java.lang.reflect.Array;
import java.util.Arrays;

import acm.program.*;

public class problem54 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter number: ");
		int[] nums = new int[n];
		Arrays.sort(nums);
		println(nums[n-1]);
		println(nums[n-2]);
		
	}
}
