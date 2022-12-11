package leet_202212;

/**
 * 713. 乘积小于 K 的子数组
 */
public class NumSubarrayProductLessThanK {
	public int numSubarrayProductLessThanK(int[] nums, int k) {
		if(k<=1)
			return 0;
		int n= nums.length;
		int produce=1;
		int ans=0;
		int left=0,right=0;

		while(right<n) {
			produce*=nums[right];
			while(produce>=k){
				produce/=nums[left];
				left++;
			}
			//属于left到right之间的都是子数组(左边界是left的)
			ans+=right-left+1;
			right++;
		}
		return ans;
		
	}
}
