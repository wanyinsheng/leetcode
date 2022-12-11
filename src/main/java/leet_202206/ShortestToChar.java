package leet_202206;

/**
 * @Author wanys
 * @Date 2022/6/29 10:30 AM
 * @Version 1.0
 **/
public class ShortestToChar {

    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int[] ans=new int[n];
        int idx=-n;//从左到右遍历，最近的距离是-n
        for (int i = 0; i <n ; i++) {
            if (s.charAt(i) == c) {
                idx = i;
            }
            ans[i] = i - idx;
        }

        idx=2*n;//从右到左遍历，最近的距离是n
        for (int i = n-1; i >=0 ; i--) {
            if (s.charAt(i) == c) {
                idx = i;
            }
            ans[i] = Math.min(ans[i], idx - i);
        }
        return ans;
    }
}
