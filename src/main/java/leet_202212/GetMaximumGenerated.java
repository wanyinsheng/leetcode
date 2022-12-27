package leet_202212;

import java.util.Arrays;

/**
 * 1646. 获取生成数组中的最大值
 */
public class GetMaximumGenerated {
	public int getMaximumGenerated(int n) {
		//模拟题，分i为奇数和i为偶数
		if (n == 0) {
			return 0;
		}
		int[] nums = new int[n + 1];
		nums[1] = 1;
		for (int i = 2; i <= n; ++i) {
			nums[i] = nums[i / 2] + i % 2 * nums[i / 2 + 1];
		}
		return Arrays.stream(nums).max().getAsInt();

	}
}
