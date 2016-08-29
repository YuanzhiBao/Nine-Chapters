
public class FindNumberRotate {
	public int findRotateSpot (int[] nums) {
		if (nums == null || nums.length == 0) {
			return -1;
		}
		
		int start = 0, end = nums.length - 1;
		while (start + 1 < end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] >= nums[start]) {
				start = mid;
			} else {
				end = mid;
			}
		}
		return start;
	}
	public int searchRotateArray(int[] nums, int target, int spot) {
		if (spot == -1) {
			return -1;
		}
		int start = 0;
		int end = nums.length - 1;
		if (target == nums[spot]) {
			return spot;
		} else if (target >= nums[0]) {
			end = spot;
		} else {
			start = spot + 1;
		}
		while (start + 1 < end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				end = mid;
			} else {
				start = mid;
			}
		}
		if (nums[start] == target) {
			return start;
		} 
		if (nums[end] == target) {
			return end;
		}
		return -1;
	}
}
