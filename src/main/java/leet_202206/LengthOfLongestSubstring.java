package leet_202206;

import java.util.HashSet;

/**
 * 剑指 Offer 48. 最长不含重复字符的子字符串
 * @Author wanys
 * @Date 2022/6/8 10:39 AM
 * @Version 1.0
 **/
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        //判断有没有出现过
        HashSet<Character> set = new HashSet<>();
        int n=s.length();
        int right=0;
        int ans=0;
        for (int i = 0; i <n ; i++) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                set.remove(s.charAt(i - 1));
            }
            while(right+1<n&&!set.contains(s.charAt(right+1))){
                set.add(s.charAt(right+1));
                right++;
            }
            ans=Math.max(ans,right-i+1);
            
        }
        return  ans;
        
    }
}
