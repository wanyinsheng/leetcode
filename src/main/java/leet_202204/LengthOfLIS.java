package leet_202204;

/**
 * 300. 最长递增子序列
 * @Author wanys
 * @Date 2022/4/8 5:04 PM
 * @Version 1.0
 **/
public class LengthOfLIS {
    public int lengthOfLIS(int[] nums) {
        //特殊值处理
        if(nums.length==0)
            return 0;

        int[] dp=new int[nums.length];
        dp[0]=1;
        int maxLen=1;//初始化最大值
        //从下标1开始
        for (int i = 1; i < nums.length; i++) {
            dp[i]=1;//初始化一个新值，用于更新
            for (int j = 0; j <i ; j++) {
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            maxLen=Math.max(maxLen,dp[i]);
            
        }
        return maxLen;

    }

}
