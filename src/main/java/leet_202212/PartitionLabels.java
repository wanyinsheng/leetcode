package leet_202212;

import java.util.ArrayList;
import java.util.List;

/**
 * 763. 划分字母区间
 */
public class PartitionLabels {
	/**
	 * 记录下每个字母的开始和截止下标，组成一个个区间
	 *
	 * @param s
	 * @return
	 */
	public List<Integer> partitionLabels(String s) {
		int[] last = new int[26];
		int length = s.length();
		for (int i = 0; i < length; i++) {
			last[s.charAt(i) - 'a'] = i;
		}
		List<Integer> partition = new ArrayList<Integer>();
		int start = 0;
		int end = 0;//end是当前片段的最大值
		for (int i = 0; i < length; i++) {
			end = Math.max(end, last[s.charAt(i) - 'a']);//当前片段的最大值，

			if (i == end) {
				partition.add(end - start + 1);//增加一个区间
				start = end + 1;//修改start的位置
			}
		}
		return partition;

	}
}
