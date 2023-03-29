package leet_202303;

import java.util.Arrays;

/**
 * 233. 数字 1 的个数
 *
 * @Author wanys
 * @Date 2023/3/7 15:48
 * @Version 1.0
 **/
public class CountDigitOne {
    char s[];
    int dp[][];

    public int countDigitOne(int n) {
        s = Integer.toString(n).toCharArray();
        int m = s.length;//最大数字的位数
        dp = new int[m][m];
        for (int i = 0; i < m; i++) Arrays.fill(dp[i], -1);
        return f(0, 0, true);
    }

    int f(int i, int cnt1, boolean isLimit) {
        if (i == s.length) return cnt1;
        if (!isLimit && dp[i][cnt1] >= 0)
            return dp[i][cnt1];
        int res = 0;
        for (int d = 0, up = isLimit ? s[i] - '0' : 9; d <= up; ++d) // 枚举要填入的数字 d
            res += f(i + 1, cnt1 + (d == 1 ? 1 : 0), isLimit && d == up);
        if (!isLimit) dp[i][cnt1] = res;
        return res;
    }
}
