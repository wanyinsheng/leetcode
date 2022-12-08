package leet_202209;

import java.util.Arrays;

/**
 * @Author wanys
 * @Date 2022/9/13 22:20
 * @Version 1.0
 **/
public class SpecialArray {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        //从大到小(使用交换的方式)
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        //x属于[1,n]
        for (int i = 1; i <=n ; i++) {
            if(nums[i-1]>=i&&(i==n||nums[i]<i)){
                return i;
            }
        }
        return -1;
    }
}
