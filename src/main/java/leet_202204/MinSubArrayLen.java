package leet_202204;

/**
 * @Author wanys
 * @Date 2022/4/23 12:37 AM
 * @Version 1.0
 **/
public class MinSubArrayLen {
    /**
     * 滑动窗口
     *
     *
     * 定义两个指针 start 和end 分别表示子数组（滑动窗口窗口）的开始位置和结束位置，维护变量 sum 存储子数组中的元素和（即从nums[start] 到 nums[end] 的元素和）
     *
     *
     * @param target
     * @param nums
     * @return
     */
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        if(n==0)
            return 0;
        int ans=Integer.MAX_VALUE;
        int start=0,end=0;
        int sum=0;
        while(end<n){//开始一个窗口
            sum+=nums[end];
            while(sum>=target) {//移动一个窗口
                ans=Math.min(ans,end-start+1);
                sum-=nums[start];
                start++;
            }
            end++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;

    }
}
