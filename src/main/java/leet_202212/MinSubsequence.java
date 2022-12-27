package leet_202212;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1403. 非递增顺序的最小子序列
 */
public class MinSubsequence {
	//贪心，取较大的几个元素，尽可能使元素数少
	public List<Integer> minSubsequence(int[] nums) {
		//总和
		int total = Arrays.stream(nums).sum();
		Arrays.sort(nums);
		//结果是按照非递增的顺序
		List<Integer> ans = new ArrayList<Integer>();
		int curr = 0;
		for (int i = nums.length - 1; i >= 0; --i) {
			curr += nums[i];
			ans.add(nums[i]);
			//大于剩余元素的和
			if (total - curr < curr) {
				break;
			}
		}
		return ans;
	}
}
