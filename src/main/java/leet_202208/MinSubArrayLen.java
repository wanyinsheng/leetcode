package leet_202208;

import java.util.Arrays;

/**
 * @Author wanys
 * @Date 2022/8/1 09:43
 * @Version 1.0
 **/
public class MinSubArrayLen {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        if(n==0)
            return 0;
        int ans=Integer.MAX_VALUE;
        int[] sums=new int[n+1];
        for (int i = 1; i <n+1 ; i++) {
            sums[i]=sums[i-1]+nums[i-1];
        }
        for (int i = 1; i <= n; i++) {
            int tar = target + sums[i - 1];
            int bound = Arrays.binarySearch(sums, tar);
            if (bound < 0) {
                bound = -bound - 1;
            }
            if (bound <= n) {
                ans = Math.min(ans, bound - (i - 1));
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;


    }
}
