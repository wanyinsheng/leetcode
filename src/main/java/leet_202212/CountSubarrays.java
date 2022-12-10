package leet_202212;

import java.util.HashMap;
import java.util.Map;

/**
 * 2488. 统计中位数为 K 的子数组
 */
public class CountSubarrays {
	public int countSubarrays(int[] nums, int k) {
		int pos = 0, n = nums.length;
		//找到k的位置pos
		while (nums[pos] != k) ++pos;
		Map<Integer,Integer> cnt = new HashMap<Integer, Integer>();
		//设置k的个数，因为k是0
		cnt.put(0, 1); // i=pos 的时候 c 是 0，直接记到 cnt 中，这样下面不是大于就是小于
		//标记右侧的大于k，小于k的个数
		for (int i = pos + 1, c = 0; i < n; ++i) {
			c += nums[i] > k ? 1 : -1;//c是向右累加子数组的和
			cnt.put(c, cnt.getOrDefault(c, 0) + 1);
		}
		//仍然是c和c+1的个数，只不过这里的c=0，针对k单独统计一下，下边只考虑k左侧
		int ans = cnt.get(0) + cnt.getOrDefault(1, 0); // i=pos 的时候 c 是 0，直接加到答案中，这样下面不是大于就是小于
		//从pos往左边遍历匹配map统计个数
		for (int i = pos - 1, c = 0; i >= 0; --i) {
			c += nums[i] < k ? 1 : -1;
			ans += cnt.getOrDefault(c, 0) + cnt.getOrDefault(c + 1, 0);//计算奇数个+偶数个
		}



		return ans;
	}
}
