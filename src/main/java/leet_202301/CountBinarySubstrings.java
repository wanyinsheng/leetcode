package leet_202301;

import java.util.ArrayList;
import java.util.List;

/**
 * 696. 计数二进制子串
 *
 * @Author wanys
 * @Date 2023/1/6 22:34
 * @Version 1.0
 **/
public class CountBinarySubstrings {
    public int countBinarySubstrings(String s) {
        //方法一：按字符分组
        List<Integer> counts = new ArrayList<Integer>();
        int ptr = 0, n = s.length();
        while (ptr < n) {
            char c = s.charAt(ptr);
            int count = 0;
            while (ptr < n && s.charAt(ptr) == c) {
                ++ptr;
                ++count;
            }
            counts.add(count);
        }
        int ans = 0;
        for (int i = 1; i < counts.size(); ++i) {
            ans += Math.min(counts.get(i), counts.get(i - 1));
        }
        return ans;

    }
}
