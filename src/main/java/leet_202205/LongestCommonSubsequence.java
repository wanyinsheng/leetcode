package leet_202205;

/**
 * @Author wanys
 * @Date 2022/5/22 11:42 AM
 * @Version 1.0
 **/
public class LongestCommonSubsequence {

    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m + 1][n + 1];
        //第一行第一列填充0
        for (int i = 1; i <= m; i++) {
            char c1 = text1.charAt(i - 1);
            for (int j = 1; j <= n; j++) {
                char c2 = text2.charAt(j - 1);
                if (c1 == c2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);//选择左边或者上边较大的
                }
            }
        }
        return dp[m][n];
    }
}
