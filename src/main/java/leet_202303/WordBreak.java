package leet_202303;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author wanys
 * @Date 2023/3/7 10:41
 * @Version 1.0
 **/
public class WordBreak {
    /**
     * 动态规划
     */
    public boolean wordBreak(String s, List<String> wordDict) {
        //重新构建字典
        Set<String> wordDictSet = new HashSet(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        //初始化
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;//第i个字符可以
                }
            }
        }
        return dp[s.length()];
    }

}
