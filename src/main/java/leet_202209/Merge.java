package leet_202209;

/**
 * @Author wanys
 * @Date 2022/9/5 11:03
 * @Version 1.0
 **/
public class Merge {
    public void merge(int[] A, int m, int[] B, int n) {
        int pa = 0, pb = 0;
        int[] sorted = new int[m + n];
        int cur;
        while (pa < m || pb < n) {
            if (pa == m) {
                cur = B[pb++];
            } else if (pb == n) {
                cur = A[pa++];
            } else if (A[pa] < B[pb]) {
                cur = A[pa++];
            } else {
                cur = B[pb++];
            }
            sorted[pa + pb - 1] = cur;
        }
        for (int i = 0; i != m + n; ++i) {
            A[i] = sorted[i];
        }
    }
}
