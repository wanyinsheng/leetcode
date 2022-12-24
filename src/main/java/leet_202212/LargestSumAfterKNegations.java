package leet_202212;

import java.util.Arrays;

/**
 * 1005. K 次取反后最大化的数组和
 */
public class LargestSumAfterKNegations {
	public int largestSumAfterKNegations(int[] nums, int k) {
		Arrays.sort(nums);
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			//从前向后遍历，遇到负数将其变为正数，同时K--
			if (nums[i] < 0 && k > 0) {
				nums[i] = -nums[i];
				k--;
				//这里k=0的话可以提前结束循环
			}
		}
		//找到那个最小值
		Arrays.sort(nums);
		int sum=Arrays.stream(nums).sum();
		// 如果K还大于0，那么反复转变数值最小的元素，将K用完
		//剩下的是这个肯定是大于0的元素
		if(k%2==1) {
			sum-=2*(nums[0]);
		}

		return sum;
	}

}
