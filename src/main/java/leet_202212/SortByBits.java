package leet_202212;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 1356. 根据数字二进制下 1 的数目排序
 */
public class SortByBits {
	public int[] sortByBits(int[] arr) {
		return Arrays.stream(arr).boxed()
				.sorted(new Comparator<Integer>() {
					@Override
					public int compare(Integer o1, Integer o2) {
						int cnt1 = cntInt(o1);
						int cnt2 = cntInt(o2);
						return (cnt1 == cnt2) ? Integer.compare(o1, o2) : Integer.compare(cnt1, cnt2);//如果相等的话直接比数字
					}
				})
				.mapToInt(Integer::intValue)
				.toArray();
	}

	/**
	 * 统计1的个数
	 * @param val
	 * @return
	 */
	private int cntInt(int val) {
		int count = 0;
		while (val > 0) {
			val = val & (val - 1);
			count++;
		}

		return count;
	}
}
