package leet_202207;

/**
 * 2185. 统计包含给定前缀的字符串
 * @Author wanys
 * @Date 2022/7/2 10:36 上午
 * @Version 1.0
 **/
public class PrefixCount {

    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String s:words) {
            if (s.startsWith(pref)) count++;
        }
        return count;
    }
}
