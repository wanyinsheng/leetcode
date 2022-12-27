package leet_202212;

import java.util.Arrays;

public class EraseOverlapIntervals {
	/**
	 * 按照右边界排序，就要从左向右遍历，因为右边界越小越好，只要右边界越小，留给下一个区间的空间就越大，所以从左向右遍历，优先选右边界小的。
	 *
	 * 按照左边界排序，就要从右向左遍历，因为左边界数值越大越好（越靠右），这样就给前一个区间的空间就越大，所以可以从右向左遍历。
	 *
	 *
	 * 我来按照右边界排序，从左向右记录非交叉区间的个数。最后用区间总数减去非交叉区间的个数就是需要移除的区间个数了。
	 */
	public int eraseOverlapIntervals(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> {
			// 按照区间右边界升序排序
			return a[1] - b[1];
		});

		int count = 0;
		int edge = Integer.MIN_VALUE;
		for (int i = 0; i < intervals.length; i++) {
			// 若上一个区间的右边界小于当前区间的左边界，说明无交集
			if (edge <= intervals[i][0]) {
				edge = intervals[i][1];
			} else {
				count++;
			}
		}
		return count;
	}
}
