package leet_202212;

import java.util.List;

/**
 * 120. 三角形最小路径和
 */
public class MinimumTotal {
	public int minimumTotal(List<List<Integer>> triangle) {
		//动态规划
		int n = triangle.size();
		int[][] dp = new int[n][n];

		dp[0][0] = triangle.get(0).get(0);

		for (int i = 1; i < n; i++) {
			//第0列只能从上一行的第0列过来
			dp[i][0] = dp[i - 1][0] + triangle.get(i).get(0);
			//中间列
			for (int j = 1; j < i; ++j) {
				dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i - 1][j]) + triangle.get(i).get(j);
			}
			//最后一列
			dp[i][i] = dp[i - 1][i - 1] + triangle.get(i).get(i);

		}
		//找最小值(遍历最后一行)
		int minTotal = dp[n - 1][0];
		for (int i = 1; i < n; ++i) {
			minTotal = Math.min(minTotal, dp[n - 1][i]);
		}
		return minTotal;

	}
}
