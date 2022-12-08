package leet_202209;

/**
 * @Author wanys
 * @Date 2022/9/14 00:09
 * @Version 1.0
 **/
public class MajorityElement {
    public int majorityElement(int[] nums) {
        //边界条件判断
        if(nums == null||nums.length == 0){
            return -1;
        }
        //先找到主要元素
        int major=nums[0];
        int count=1;
        for (int i = 1; i < nums.length ; i++) {
            if(major==nums[i]){
                //如果major等于当前元素，count+1
                count++;
            }else{
                count--;
                if(count<0){
                    //如果count<0，已经全部抵消了，重新赋值major
                    major=nums[i];
                    count=1;
                }
            }
        }
        //上边判断了可能存在的主要元素，下边需要判断是不是主要元素
        count=0;
        for (int i = 0; i < nums.length ; i++) {
            if(major==nums[i]){
                count++;
            }
        }
        System.out.println(count);
        if(count>nums.length>>1){
            return major;
        }
        return -1;
    }
}
