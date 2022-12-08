package leet_202208;

import java.util.Arrays;

/**
 * @Author wanys
 * @Date 2022/8/2 10:17
 * @Version 1.0
 **/
public class CheckInclusion {
    /**
     * 滑动窗口
     * @param s1
     * @param s2
     * @return
     */
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(n>m)
            return false;
        int[] cnt1=new int[26];
        int[] cnt2=new int[26];
        for (int i = 0; i <n ; i++) {
            cnt1[s1.charAt(i)-'a']++;
            //提前初始化s2，下文就不用双重循环，直接处理一次（加一个减一个）
            cnt2[s2.charAt(i) - 'a']++;
        }
        //初始化完之后比对一下
        if (Arrays.equals(cnt1, cnt2)) {
            return true;
        }
        for (int i = n; i <m ; i++) {//从n开始遍历
            cnt2[s2.charAt(i) - 'a']++;//加一个
            cnt2[s2.charAt(i-n) - 'a']--;//减一个
            //是否相等
            if (Arrays.equals(cnt1, cnt2)) {
                return true;
            }
        }
        return false;

    }
}
