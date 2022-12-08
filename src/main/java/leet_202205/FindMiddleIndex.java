package leet_202205;

import java.util.Arrays;

/**
 * 1991. 找到数组的中间位置
 * @Author wanys
 * @Date 2022/5/20 8:58 PM
 * @Version 1.0
 **/
public class FindMiddleIndex {
    public int findMiddleIndex(int[] nums) {
        // 求数组的总和
        int total= Arrays.stream(nums).sum();
        int sum=0;
        for (int i = 0; i <nums.length ; i++) {
            if(2*sum+nums[i]==total)
                return i;
            sum+=nums[i];
        }
        return -1;
    }

}
