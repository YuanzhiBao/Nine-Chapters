public class WoodCut {
    /** 
     *@param L: Given n pieces of wood with length L[i]
     *@param k: An integer
     *return: The maximum length of the small pieces.
     */
    public int woodCut(int[] L, int k) {
        if (L == null || L.length == 0) {
            return 0;
        }
        int max = 0;
        for (int a: L) {
            max = Math.max(max, a);
        }
        int start = 1;
        int end = max;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (sum(L, mid) >= k) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (sum(L, end) >= k) {
            return end;
        }
        if (sum(L, start) >= k) {
            return start;
        }
        return 0;
    }
    public int sum(int[] L, int cut) {
        int sum = 0;
        if (L == null || L.length == 0) {
            return 0;
        }
        for (int i = 0; i < L.length; i++) {
            sum += L[i] / cut;
        }
        return sum;
    }
}