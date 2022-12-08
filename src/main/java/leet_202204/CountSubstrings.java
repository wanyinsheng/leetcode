package leet_202204;

/**
 * @Author wanys
 * @Date 2022/4/22 11:55 PM
 * @Version 1.0
 **/
public class CountSubstrings {
    public int countSubstrings(String s) {
        int n=s.length();
        int ans=0;
        for (int i = 0; i <2*n-1 ; i++) {
            int left=i/2;
            int right=left+i%2;//偶数left和right指向同一个，奇数会指向下一个
            while(left>=0&&right<n&&s.charAt(left)==s.charAt(right)){
                ans++;
                left--;
                right++;
            }
        }
        return ans;
    }
}
