package leet_202208;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * @Author wanys
 * @Date 2022/8/30 15:58
 * @Version 1.0
 **/
public class EraseOverlapIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int n = intervals.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 1; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                if (intervals[j][1] <= intervals[i][0]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        //Arrays.stream(dp).max().getAsInt();
        return n - Arrays.stream(dp).max().getAsInt();
    }
}
