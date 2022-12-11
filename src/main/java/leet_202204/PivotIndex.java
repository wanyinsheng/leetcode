package leet_202204;

import java.util.Arrays;

/**
 * @Author wanys
 * @Date 2022/4/28 9:09 AM
 * @Version 1.0
 **/
public class PivotIndex {

    public int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();//还有这种求和方式
        int sum = 0;
        for (int i = 0; i <nums.length; i++) {
            if(2*sum+nums[i]==total) {
                return i;
            }
            sum+=nums[i];

        }
        return -1;
    }
}
