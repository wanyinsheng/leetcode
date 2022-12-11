package leet_202207;

import java.util.PriorityQueue;

/**
 * 1337. 矩阵中战斗力最弱的 K 行
 * @Author wanys
 * @Date 2022/7/1 3:02 PM
 * @Version 1.0
 **/
public class KWeakestRows {

    public int[] kWeakestRows(int[][] mat, int k) {
        int row = mat.length;
        int col = mat[0].length;
        //最小堆（默认就是升序，这里只是加了一个行号）
        PriorityQueue<int[]> queue = new PriorityQueue<>((x1, x2) -> {
            if (x1[0] != x2[0]) {
                return x1[0] - x2[0];
            } else {
                return x1[1] - x2[1];
            }
        });
        //统计每行的个数并放入最小堆
        for (int i = 0; i < row; i++) {
            int left = 0, right = col - 1;
            //二分查找最后一个1
            int pos = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (mat[i][mid] == 1) {
                    pos = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            if (pos == -1) {
                pos = 0;
            } else {
                pos++;
            }
            queue.offer(new int[]{pos, i});
        }
        //输出K个最小
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = queue.poll()[1];
        }
        return ans;
    }

}
