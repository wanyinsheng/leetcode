package leet_202212;

/**
 * 53. 最大子数组和
 */
public class MaxSubArray {
	public int maxSubArray(int[] nums) {
		/**
		 * 贪心
		 */
		if(nums.length == 1){
			return nums[0];
		}
		int ans = Integer.MIN_VALUE;
		int currSum = 0;
		for (int i = 0; i <nums.length ; i++) {
			currSum+=nums[i];
			ans=Math.max(ans,currSum);
			if (currSum <= 0){//如果和为负数，赶紧更新为0 ，果断放弃之前的累积和
				currSum = 0; // 相当于重置最大子序起始位置，因为遇到负数一定是拉低总和
			}
		}
		return ans;
	}
}
