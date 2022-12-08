package leet_202210;

/**
 * @Author wanys
 * @Date 2022/10/17 20:11
 * @Version 1.0
 **/
public class NumberOfSubarrays {
    /**
     * 这道题也和一道经典的题目很像，那道题目是求一个数组和等于目标值的子数组个数。
     * 这道题目，如果对于奇数我们看作 1，对于偶数我们看作 0，问题就转化为了求和为 k 的子数组个数。
     * @param nums
     * @param k
     * @return
     */
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        int[] cnt=new int[n+1];//频次数组cnt记录pre[i] 出现的次数
        int odd=0;//累计到当前奇数元素个数，直接用odd 变量来记录 pre[i−1] 的答案即可。
        int ans=0;
        cnt[0]=0;
        for (int i = 0; i <n ; i++) {
            odd += nums[i] & 1;//x & 1,偶数为0，奇数为1
            ans += odd >= k ? cnt[odd - k] : 0;
            cnt[odd] += 1;
        }
        return ans;
    }
}
