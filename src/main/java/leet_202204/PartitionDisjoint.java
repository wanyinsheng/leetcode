package leet_202204;

/**
 * @Author wanys
 * @Date 2022/4/28 8:38 AM
 * @Version 1.0
 **/
public class PartitionDisjoint {

    public int partitionDisjoint(int[] nums) {
        int n = nums.length;
        //整个数组的最大值
        int max = nums[0];
        //存放left数组[0,pos]的最大值
        int leftMax = nums[0];
        int pos = 0;
        for(int i = 0; i < n; i++){
            max = Math.max(max, nums[i]);
            //这里相当于是加入到了right数组，没有加入left数组
            if(nums[i] >= leftMax)
                continue;
            //加入left数组，出现了小于leftmax的，我们就需要更新left数组信息
            leftMax = max;
            pos = i;
        }
        return pos+1;



    }
}
