
public class IfContains {
	public boolean findContains(int[][] testCase, int target) {
		if (testCase == null || testCase.length == 0) {
			return false;
		}
		if (testCase[0] == null || testCase[0].length == 0) {
			return false;
		}
		int start = 0;
		int end = testCase.length - 1;
		int row = 0;
		// check if target out of the testCase bound
		if (testCase[0][0] > target || testCase[end][testCase[end].length - 1] < target) {
			return false;
		}
		// locate two rows that include target
		while (start + 1 < end) {
			int mid = start + (end - start) / 2;
			if (testCase[mid][0] == target) {
				return true;
			} else if (testCase[mid][0] > target) {
				end = mid;
			} else {
				start = mid;
			}
		}
		//decide which row contains the target
		if (testCase[end][0] <= target) {
			row = end;
		} else {
			row = start;
		}
		//find whether this row contains this number, first choose two numbers
		start = 0;
		end = testCase[row].length - 1;
		while (start + 1 < end) {
			int mid = start + (end - start) / 2;
			if (testCase[row][mid] == target) {
				return true;
			} else if (testCase[row][mid] > target) {
				end = mid;
			} else {
				start = mid;
			}
		}
		//check if target in these two numbers
		if (testCase[row][start] == target) {
			return true;
		}
		if (testCase[row][end] == target) {
			return true;
		}
		return false;
	}
}
