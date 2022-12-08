package leet_202205;

/**
 * @Author wanys
 * @Date 2022/5/20 4:10 PM
 * @Version 1.0
 **/
public class ReplaceDigits {
    public String replaceDigits(String s) {
        int n = s.length();
        char[] cs = s.toCharArray();
        for (int i = 1; i < n; i += 2) {
            cs[i] = (char) (cs[i - 1] + (cs[i] - '0'));
        }
        return new String(cs);
    }
}
