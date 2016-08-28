
public class Main {

	public static void main(String[] args) {
		int[] testBinarySearch = {1,2,2,2,2,3,4,5,6};
		BinarySearch testCase = new BinarySearch();
		int index = testCase.findNumberIndex(testBinarySearch, 2);
		System.out.println(index);
		BinarySearchFirst testCase2 = new BinarySearchFirst();
		int firstIndex = testCase2.findFirstNumberIndex(testBinarySearch, 2);
		System.out.println(firstIndex);
		BinarySearchLast testCase3 = new BinarySearchLast();
		int lastIndex = testCase3.findLastNumberIndex(testBinarySearch, 2);
		System.out.println(lastIndex);
		
	}

}
