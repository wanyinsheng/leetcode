package leet_202206;

/**
 * 剑指 Offer 15. 二进制中1的个数
 * @Author wanys
 * @Date 2022/6/10 10:24 PM
 * @Version 1.0
 **/
public class HammingWeight {
    public int hammingWeight(int n) {
        int ans=0;
        while(n!=0){
            n&=n-1;
            ans++;
        }
        return ans;

    }
}
