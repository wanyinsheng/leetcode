package leet_202208;

import java.util.Arrays;

/**
 * 724. 寻找数组的中心下标
 * @Author wanys
 * @Date 2022/8/30 14:52
 * @Version 1.0
 **/
public class PivotIndex {
    /**
     * 前缀和思想  总和为total，前缀为sum，中心元素为num，右侧元素和也为sum，
     * 即total-sum-num=sum
     * @param nums
     * @return
     */
    public int pivotIndex(int[] nums) {
        int  total= Arrays.stream(nums).sum();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(2*sum+nums[i]==total){
                return i;
            }
            //更新前缀和
            sum+=nums[i];
        }
        return -1;
    }
}
