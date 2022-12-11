package leet_202206;

import java.util.List;

/**
 * @Author wanys
 * @Date 2022/6/30 3:23 PM
 * @Version 1.0
 **/
public class MinimumTotal {

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i - 1][0] + triangle.get(i).get(0);
            for (int j = 1; j < i; ++j) {
                dp[i][j]=Math.min(dp[i - 1][j - 1], dp[i - 1][j])+triangle.get(i).get(j);
            }
            dp[i][i] = dp[i - 1][i - 1] + triangle.get(i).get(i);
        }
        int minTotal = dp[n - 1][0];
        for (int i = 1; i < n; ++i) {
            minTotal = Math.min(minTotal, dp[n - 1][i]);
        }
        return minTotal;
    }
}
