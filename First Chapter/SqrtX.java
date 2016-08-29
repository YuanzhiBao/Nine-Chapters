class SqrtX {
    /**
     * @param x: An integer
     * @return: The sqrt of x
     */
    public int sqrt(int x) {
        // write your code here
        long start = 1, end = x;
        long mid;
        while (start + 1 < end ) {
            mid = start + (end - start)/2;
            if (mid * mid <= x) {
                start = mid;
            }else {
                end = mid;
            }
        }
        if (end * end <= x) {
            return (int)end;
        }
        return (int)start;
    }
}