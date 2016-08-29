
public class SearchInsertPosition {
    /** 
     * param A : an integer sorted array
     * param target :  an integer to be inserted
     * return : an integer
     */
    public int searchInsert(int[] A, int target) {
        if (A == null || A.length == 0) {
            return 0;
        }
        int start = 0;
        int end = A.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (A[mid] == target) {
                return mid;
            }
            if (A[mid] > target) {
                end = mid;
            }
            if (A[mid] < target) {
                start = mid;
            }
        }
        if (A[start] >= target) {
            return start;
        }
        if (A[end] == target) {
            return end;
        }
        if (A[end] < target) {
            return end + 1;
        }
        return start + 1;
    }
}
