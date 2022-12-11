package leet_202206;

import java.util.Arrays;

/**
 * 剑指 Offer II 012. 左右两边子数组的和相等
 * @Author wanys
 * @Date 2022/6/6 10:23 PM
 * @Version 1.0
 **/
public class PivotIndex {

    public int pivotIndex(int[] nums) {
        //求数组的和
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i <nums.length ; i++) {
            if(2*sum+nums[i]==total){
                return i;
            }
            sum+=nums[i];
            
        }
        return -1;

    }

}
