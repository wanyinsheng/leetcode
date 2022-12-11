package leet_202207;

/**
 * 2255. 统计是给定字符串前缀的字符串数目
 * @Author wanys
 * @Date 2022/7/2 10:33 上午
 * @Version 1.0
 **/
public class CountPrefixes {

    public int countPrefixes(String[] words, String s) {
        int res=0;
        for (int i = 0; i < words.length ; i++) {
            if(s.startsWith(words[i])){
                res++;
            }
        }
        return res;
    }
}
