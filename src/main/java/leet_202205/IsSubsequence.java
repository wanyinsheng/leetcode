package leet_202205;

/**
 * 392. 判断子序列
 * @Author wanys
 * @Date 2022/5/20 4:57 PM
 * @Version 1.0
 **/
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int n = s.length(), m = t.length();
        int i = 0, j = 0;
        //不要求是连续的子串
        while(i<n&&j<m){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==n;
    }
}
