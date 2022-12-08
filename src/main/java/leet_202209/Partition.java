package leet_202209;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author wanys
 * @Date 2022/9/7 13:44
 * @Version 1.0
 **/
public class Partition {
    boolean[][] dp;
    List<List<String>> ret = new ArrayList<List<String>>();
    List<String> ans = new ArrayList<String>();
    int n;

    public List<List<String>> partition(String s) {
        n = s.length();
        dp = new boolean[n][n];
        for (int i = 0; i < n; ++i) {
            Arrays.fill(dp[i], true);
        }

        for (int i = n - 1; i >= 0; --i) {
            for (int j = i + 1; j < n; ++j) {
                dp[i][j] = (s.charAt(i) == s.charAt(j)) && dp[i + 1][j - 1];
            }
        }

        dfs(s, 0);
        return ret;
    }

    public void dfs(String s, int i) {
        if (i == n) {
            ret.add(new ArrayList<String>(ans));
            return;
        }
        for (int j = i; j < n; ++j) {
            if (dp[i][j]) {
                ans.add(s.substring(i, j + 1));
                dfs(s, j + 1);
                ans.remove(ans.size() - 1);
            }
        }
    }
}

