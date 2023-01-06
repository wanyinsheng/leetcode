package leet_202301;

import java.util.Arrays;

/**
 * 1668. 最大重复子字符串
 *
 * @Author wanys
 * @Date 2023/1/6 22:25
 * @Version 1.0
 **/
public class MaxRepeating {
    public int maxRepeating(String sequence, String word) {
        int n = sequence.length();
        int m = word.length();
        if (n < m) {
            return 0;
        }
        //动态规划
        int[] f = new int[n];
        for (int i = m - 1; i < n; ++i) {
            boolean valid = true;
            for (int j = 0; j < m; ++j) {
                if (sequence.charAt(i - m + j + 1) != word.charAt(j)) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                f[i] = (i == m - 1 ? 0 : f[i - m]) + 1;
            }
        }

        return Arrays.stream(f).max().getAsInt();

    }
}
