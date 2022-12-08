package leet_202206;

/**
 * @Author wanys
 * @Date 2022/6/30 3:54 PM
 * @Version 1.0
 **/
public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n+1];
        dp[0]=dp[1]=0;
        for (int i = 2; i <=n ; i++) {
            dp[i]=Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
        }
        return dp[n];
    }
}
