package leet_202208;

/**
 * @Author wanys
 * @Date 2022/8/30 14:48
 * @Version 1.0
 **/
public class RunningSum {
    public int[] runningSum(int[] nums) {
        //原地修改
        int n=nums.length;
        for(int i=1;i<n;i++){
            //本省加前一项的和
            nums[i]+=nums[i-1];
        }
        return nums;

    }
}
