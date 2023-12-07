
import java.util.Arrays;

import acm.program.*;

public class problem56 extends ConsoleProgram {
	int n;

	public void run() {
		int n = readInt("Enter array length: ");
		int[] nums = new int[n];
		for(int i = 0; i < n; i++) {
			nums[i] = readInt("Enter number: ");
		}
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < n; j++) {
				if(nums[i] > nums[j]) {
					nums[j] = nums[i];
				}
			}
		}
		println(Arrays.toString(nums));
	}
}
