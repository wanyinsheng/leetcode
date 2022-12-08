package leet_202204;

/**
 * @Author wanys
 * @Date 2022/4/23 12:16 AM
 * @Version 1.0
 **/
public class ReverseString {
    /**
     * 双指针
     * @param s
     */
    public void reverseString(char[] s) {
        int n=s.length;
        for (int left = 0,right=n-1; left < right; left++,right--) {
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
        }
    }
}
