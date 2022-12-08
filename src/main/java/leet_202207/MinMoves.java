package leet_202207;

import java.util.Arrays;

/**
 * 453. 最小操作次数使数组元素相等
 * @Author wanys
 * @Date 2022/7/3 10:00 下午
 * @Version 1.0
 **/
public class MinMoves {
    public int minMoves(int[] nums) {
        int ans=0;
        int minNum = Arrays.stream(nums).min().getAsInt();
        for(int num:nums){
            ans+=num-minNum;
        }
        return ans;
    }
}
