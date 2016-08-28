
public class Main {

	public static void main(String[] args) {
		int[] test = {1,2,3,4,5,7,8,9,10,11,12,13};
		MatrixBuilder matrix = new MatrixBuilder();
		int[][] testCase2 = new int[3][4];
		testCase2 = matrix.maxtrixBuilder(test, 4);
		matrix.print(testCase2);
		IfContains test2 = new IfContains();
		boolean result = test2.findContains(testCase2, 6);
		System.out.println(result);
	}

}
