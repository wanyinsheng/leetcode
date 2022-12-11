package leet_202205;

/**
 * 2016. 增量元素之间的最大差值
 * @Author wanys
 * @Date 2022/5/20 10:51 PM
 * @Version 1.0
 **/
public class MaximumDifference {

    public int maximumDifference(int[] nums) {
        int maxDiff=Integer.MIN_VALUE;
        for (int i = 0; i <nums.length-1 ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[j]>nums[i])
                    maxDiff=nums[j]-nums[i];
            }
        }
        return maxDiff==Integer.MIN_VALUE?-1:maxDiff;
    }
}
