package leet_202303;

import java.util.Arrays;

/**
 * @Author wanys
 * @Date 2023/3/7 10:46
 * @Version 1.0
 **/
public class LongestPrefix {
    /**
     * Rabin-Karp 字符串编码  一种hash的方式
     * @param s
     * @return
     */
    public String longestPrefix(String s) {
        int n = s.length();
        long prefix = 0, suffix = 0;
        long base = 31, mod = 1000000007, mul = 1;
        int happy = 0;
        for (int i = 1; i < n; ++i) {
            //对于前缀而言，每在字符串最后多出一个新的字符，就相当于原编码值乘以base再加上新的字符的编码值；
            prefix = (prefix * base + (s.charAt(i - 1) - 'a')) % mod;
            //对于后缀而言，每在字符串最前多出一个新的字符，就相当于原编码值加上新的字符的编码值乘以 base的i-1次方
            suffix = (suffix + (s.charAt(n - i) - 'a') * mul) % mod;
            if (prefix == suffix) {
                happy = i;
            }
            //每次都需要调整mul，可以看成进制
            mul = mul * base % mod;
        }
        return s.substring(0, happy);
    }

    /**
     * KMP  算法
     * @param s
     * @return
     */
    public String longestPrefixKMP(String s) {
        int n = s.length();
        //fail 数组或者  next  数组
        int[] fail = new int[n];
        //初始化为-1
        Arrays.fill(fail, -1);
        for (int i = 1; i < n; ++i) {
            int j = fail[i - 1];
            while (j != -1 && s.charAt(j + 1) != s.charAt(i)) {
                j = fail[j];
            }
            if (s.charAt(j + 1) == s.charAt(i)) {
                fail[i] = j + 1;
            }
        }
        return s.substring(0, fail[n - 1] + 1);
    }
}
