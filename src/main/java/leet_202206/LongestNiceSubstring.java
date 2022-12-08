package leet_202206;

/**
 * 1763. 最长的美好子字符串
 * @Author wanys
 * @Date 2022/6/10 11:26 PM
 * @Version 1.0
 **/
public class LongestNiceSubstring {
    public String longestNiceSubstring(String s) {
        int n=s.length();
        int maxPos=0;
        int maxLen=0;
        for (int i = 0; i <n ; i++) {
            int lower=0;
            int upper=0;
            for (int j = i; j < n; ++j) {
                if (Character.isLowerCase(s.charAt(j))) {
                    lower |= 1 << (s.charAt(j) - 'a');
                } else {
                    upper |= 1 << (s.charAt(j) - 'A');
                }
                if (lower == upper && j - i + 1 > maxLen) {
                    maxPos = i;
                    maxLen = j - i + 1;
                }
            }

        }
        return s.substring(maxPos, maxPos + maxLen);
    }
}
