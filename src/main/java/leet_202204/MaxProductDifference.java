package leet_202204;

/**
 * @Author wanys
 * @Date 2022/4/28 9:56 AM
 * @Version 1.0
 **/
public class MaxProductDifference {

    public int maxProductDifference(int[] nums) {
        int max1 = Math.max(nums[0], nums[1]);
        int max2 = Math.min(nums[0], nums[1]);

        int min1 = Math.min(nums[0], nums[1]);
        int min2 = Math.max(nums[0], nums[1]);


        for (int i = 2; i < nums.length; i++) {
            int temp = nums[i];
            //修改两个最大数组中的最大的，并且更新次大数
            if (temp > max1) {
                max2 = max1;
                max1 = temp;
            } else if (temp > max2) {//处于max2与max1之间就修改次大致
                max2 = temp;
            }
            //修改两个较小值
            if(temp<min1){
                min2=min1;
                min2=temp;
            }else if(temp<min2){
                min2=temp;
            }


        }
        return (max1*max2)-(min1*min2);
    }
}
