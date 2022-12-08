package leet_202210;

/**
 * @Author wanys
 * @Date 2022/10/17 15:28
 * @Version 1.0
 **/
public class CuttingRope {
    public int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            int curMax = 0;
            for (int j = 1; j < i; j++) {
                curMax = Math.max(curMax, Math.max(j * (i - j), j * dp[i - j]));
            }
            dp[i] = curMax;
        }
        return dp[n];
    }
}
