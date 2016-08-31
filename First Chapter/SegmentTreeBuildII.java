/**
 * Definition of SegmentTreeNode:
 * public class SegmentTreeNode {
 *     public int start, end, max;
 *     public SegmentTreeNode left, right;
 *     public SegmentTreeNode(int start, int end, int max) {
 *         this.start = start;
 *         this.end = end;
 *         this.max = max
 *         this.left = this.right = null;
 *     }
 * }
 */
//  给的是Array。注意找区间内的max, assign给区间。   其余和普通的segment tree build一样   

// 给了array,但是并不根据array里的内容排位，而是依然根据index in [0, array.length - 1]割开区间，break到底，   
// 最终start==end。同时assign max=A[start] or A[end]

// 往上,parent一层的max:就是比较左右孩子,其实都是在两个sub-tree里面比较sub-tree的max。   

// 这就好做了：   
// 先分，找到left/right，比较max,在create current node,再append到当前node上面。

// 实际上是depth-first, 自底向上建立起的。

 
public class SegmentTreeBuildII {
    /**
     *@param A: a list of integer
     *@return: The root of Segment Tree
     */
    public SegmentTreeNode build(int[] A) {
        if (A == null || A.length == 0) {
            return null;
        }
        SegmentTreeNode head = builderHelper(A, 0, A.length - 1);
        return head;
    }
    public SegmentTreeNode builderHelper(int[] A, int start, int end) {
        int max = Integer.MIN_VALUE;
        SegmentTreeNode current = new SegmentTreeNode(start, end, max);
        if (start == end) {
            max = A[start];
            current = new SegmentTreeNode(start, end, max);
            return current;
        }
        current.left = builderHelper(A, start, (start + (end - start) / 2 ));
        current.right = builderHelper(A, (start + (end - start) / 2) + 1, end);
        current.max = Math.max(current.left.max, current.right.max);
        return current;
    }
}