package leet_202204;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author wanys
 * @Date 2022/4/23 5:56 PM
 * @Version 1.0
 **/
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int n=s.length();
        int ans=0;
        int right=0;
        for (int i = 0; i <n ; i++) {
            if (i != 0) {//左指针要移动
                // 左指针向右移动一格，移除一个字符
                set.remove(s.charAt(i - 1));
            }
            //一直移动右指针
            while(right<n&&!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
            }
            //遇到重复了就找到边界了，需要重新移动窗口
            ans=Math.max(ans,right-i);
        }
        return ans;


    }

}
