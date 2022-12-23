package leet_202212;

import java.util.Arrays;

/**
 * 455. 分发饼干
 */
public class FindContentChildren {
	/**
	 * 贪心算法
	 * @param g
	 * @param s
	 * @return
	 */
	public int findContentChildren(int[] g, int[] s) {
		// 思路2：优先考虑胃口，先喂饱大胃口
		Arrays.sort(g);//孩子
		Arrays.sort(s);//饼干
		int count = 0;
		int start = s.length - 1;
		// 遍历胃口
		for (int index = g.length - 1; index >= 0; index--) {
			//如果当前还在的胃口不能满足，那就得找下一个小胃口的孩子了
			if(start >= 0 && g[index] <= s[start]) {
				start--;
				count++;
			}
		}
		return count;
	}
}
