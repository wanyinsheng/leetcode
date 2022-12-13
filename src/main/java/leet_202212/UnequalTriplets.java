package leet_202212;

import java.util.Arrays;

/**
 * 2475. 数组中不等三元组的数目
 */
public class UnequalTriplets {
	/**
	 * 小于 x的数有 a 个；
	 * 等于 x 的数有 b 个；
	 * 大于 x的数有 c 个。
	 * @param nums
	 * @return
	 */
	public int unequalTriplets(int[] nums) {
		Arrays.sort(nums);
		int n=nums.length;
		int ans=0;
		int start=0;
		for(int i=0;i<n-1;i++){
			if(nums[i]!=nums[i+1]){
				ans+=start*(i-start+1)*(n-1-i);
				start=i+1;
			}
		}
		return ans;
	}
}
