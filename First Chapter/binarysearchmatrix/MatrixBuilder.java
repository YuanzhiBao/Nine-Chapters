import javax.sql.rowset.CachedRowSet;

public class MatrixBuilder {
	private int[][] result;
	public int[][] maxtrixBuilder(int[] nums, int colomn) {
		int length = nums.length;
		int row = length / colomn;
		result = new int[row][colomn];
		int index = 0;
		for (int i = 0; i < row; i ++) {
			for (int j = 0; j < colomn; j++) {
				result[i][j] = nums[index++];
			}
		}
		return result;
	}
	public void print(int[][] test1) {
		for (int i = 0; i < test1.length; i++) {
			for (int j = 0; j < test1[i].length; j++) {
				System.out.print(test1[i][j]);
			}
			System.out.println("*****");
		}
	}
}
