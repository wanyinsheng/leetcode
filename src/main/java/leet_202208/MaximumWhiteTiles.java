package leet_202208;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author wanys
 * @Date 2022/8/2 09:51
 * @Version 1.0
 **/
public class MaximumWhiteTiles {
    public int maximumWhiteTiles(int[][] tiles, int carpetLen) {
        Arrays.sort(tiles, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];//升序排序
            }
        });
        int n = tiles.length;
        int left = 0;
        int right = 0;
        int sum = 0;
        int max = 0;
        while (left <= right) {
            //每次都将毛毯放在区间左侧开头
            int leftBoundary = tiles[left][0];
            int rightBoundary = leftBoundary + carpetLen - 1;
            //未覆盖完
            if (tiles[right][1] <= rightBoundary) {
                sum += tiles[right][1] - tiles[right][0] + 1;
                right++;
                max = Math.max(sum, max);
            } else {
                //覆盖部分
                if (rightBoundary >= tiles[right][0]) {
                    max = Math.max(sum + rightBoundary - tiles[right][0] + 1, max);
                }
                //调整到下一个区间开头
                sum -= tiles[left][1] - tiles[left][0] + 1;
                left++;
            }
        }
        return max;
    }
}
