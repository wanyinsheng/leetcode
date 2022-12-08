package leet_202205;

import java.util.HashMap;

/**
 * @Author wanys
 * @Date 2022/5/20 5:44 PM
 * @Version 1.0
 **/
public class AreOccurrencesEqual {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0));
        }
        //获取第一个字符
        int cnt=map.get(s.charAt(0));
        for (int i = 0; i < s.length() ; i++) {
            if(map.get(s.charAt(i))!=cnt)
                return false;
        }
        return true;
    }
}
