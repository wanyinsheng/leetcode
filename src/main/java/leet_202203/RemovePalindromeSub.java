package leet_202203;

/**
 * 1332. 删除回文子序列
 * 如果该字符串本身为回文串，此时只需删除 11 次即可，删除次数为 11。
 * 如果该字符串本身不是回文串，此时只需删除 22 次即可，比如可以先删除所有的 \texttt{`a'}‘a’，再删除所有的 \texttt{`b'}‘b’，删除次数为 22。
 *
 * @Author wanys
 * @Date 2022/3/30 2:37 PM
 * @Version 1.0
 **/
public class RemovePalindromeSub {
    public int removePalindromeSub(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; ++i) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return 2;
            }
        }
        return 1;


    }
}
