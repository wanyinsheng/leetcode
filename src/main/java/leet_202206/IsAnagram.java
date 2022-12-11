package leet_202206;

import java.util.HashMap;

/**
 * 剑指 Offer II 032. 有效的变位词
 *
 * @Author wanys
 * @Date 2022/6/6 10:54 PM
 * @Version 1.0
 **/
public class IsAnagram {

    public boolean isAnagram(String s, String t) {
        //相等不是异位词
        if (s.length() != t.length() || s.equals(t)) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) - 1);
            //如果个数出现了负数的情况，就不匹配
            if (map.get(ch) < 0) {
                return false;
            }
        }
        return true;
    }
}
