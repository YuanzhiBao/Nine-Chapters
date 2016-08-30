
public class QuickSort {
	public void quickSort (int[] input, int start, int end) {
		if (input == null || input.length == 0) {
			return;
		}
		if (start >= end) {
			return;
		}
		int partitionnum = partition(input, start, end);
		quickSort(input, start, partitionnum - 1);
		quickSort(input, partitionnum + 1, end);
		
	}
	public int partition(int[] input, int start, int end) {
		int x = input[end];
		int i = start - 1;
		int j;
		for (j = start; j < end; j++) {
			if (input[j] < x) {
				i++;
				int temp = input[j];
				input[j] = input[i];
				input[i] = temp;
			} 
		}
		int temp = input[j];
		input[j] = input[i + 1];
		input[i + 1] = temp;
		return i + 1;
	}
}
