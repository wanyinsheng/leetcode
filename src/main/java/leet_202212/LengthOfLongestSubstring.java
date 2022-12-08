package leet_202212;

import java.util.HashSet;

/**
 * 3. 无重复字符的最长子串
 */
public class LengthOfLongestSubstring {
	public int lengthOfLongestSubstring(String s) {
		//滑动窗口
		// 哈希集合，记录每个字符是否出现过
		HashSet<Character> characters = new HashSet<>();
		int n = s.length();
		// 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
		int rk = -1, ans = 0;
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				// 左指针向右移动一格，移除一个字符
				characters.remove(s.charAt(i - 1));//移除的是前边的一个字符
			}
			while (rk + 1 < n && !characters.contains(s.charAt(rk + 1))) {//下一个字符需不需要添加的判断（不越界且不在集合中）
				// 不断地移动右指针
				characters.add(s.charAt(rk + 1));//添加到集合中
				rk++;
			}
			// 第 i 到 rk 个字符是一个极长的无重复字符子串
			ans = Math.max(ans, rk - i + 1);
		}
		return ans;
	}
}
