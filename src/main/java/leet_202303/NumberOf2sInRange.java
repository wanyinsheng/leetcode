package leet_202303;

import java.util.Arrays;

/**
 * @Author wanys
 * @Date 2023/3/7 15:09
 * @Version 1.0
 **/
public class NumberOf2sInRange {
    char s[];
    int dp[][];

    /**
     * 数位 DP
     *
     * @param n
     * @return
     */
    public int numberOf2sInRange(int n) {
        s = Integer.toString(n).toCharArray();
        int m = s.length;
        dp = new int[m][m];
        for (int i = 0; i < m; i++)
            Arrays.fill(dp[i], -1);
        return f(0, 0, true);
    }
    int f(int i, int cnt2, boolean isLimit) {
        if (i == s.length)
            return cnt2;
        if (!isLimit && dp[i][cnt2] >= 0)
            return dp[i][cnt2];
        int res = 0;
        for (int d = 0, up = isLimit ? s[i] - '0' : 9; d <= up; ++d) // 枚举要填入的数字 d
            res += f(i + 1, cnt2 + (d == 2 ? 1 : 0), isLimit && d == up);
        if (!isLimit) dp[i][cnt2] = res;
        return res;
    }


}
