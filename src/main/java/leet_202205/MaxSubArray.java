package leet_202205;

/**
 * 面试题 16.17. 连续数列
 * @Author wanys
 * @Date 2022/5/21 10:48 AM
 * @Version 1.0
 **/
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int ans=0;
        int preSum=0;
        for(int num:nums){
            preSum=Math.max(preSum+num,num);//是否加当前值
            //用最大值来更新答案
            ans=Math.max(ans,preSum);
        }
        return ans;

    }
}
