package leet_202212;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 56. 合并区间
 */
public class Merge {
	public int[][] merge(int[][] intervals) {
		if (intervals.length == 0) {
			return new int[0][2];
		}
		Arrays.sort(intervals, new Comparator<int[]>() {
			public int compare(int[] interval1, int[] interval2) {
				return interval1[0] - interval2[0];//按照左边界升序
			}
		});

		List<int[]> merged = new ArrayList<int[]>();
		for (int i = 0; i < intervals.length; ++i) {
			int L = intervals[i][0], R = intervals[i][1];
			if (merged.size() == 0 || merged.get(merged.size() - 1)[1] < L) {//添加新的区间
				merged.add(new int[]{L, R});//

			} else {//修改已有区间的右边界
				merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], R);
			}
		}
		//转型
		return merged.toArray(new int[merged.size()][]);

	}
}
