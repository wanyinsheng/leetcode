package leet_202209;

import java.util.Arrays;

/**
 * @Author wanys
 * @Date 2022/9/5 10:04
 * @Version 1.0
 **/
public class MaxProduct {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }
    public int maxProduct1(int[] nums) {
        //第一大值
        int max1=nums[0];
        //第二大值
        int max2=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max1){
                max2=max1;
                max1=nums[i];
            }else if(nums[i]>max2){
                max2=nums[i];
            }
        }
        return (max1-1)*(max2-1);
    }
}
