package leet_202212;

/**
 * 738. 单调递增的数字
 */
public class MonotoneIncreasingDigits {
	/**
	 * 贪心
	 * @param n
	 * @return
	 */
	public int monotoneIncreasingDigits(int n) {
		//字符数组
		char[] strN = Integer.toString(n).toCharArray();
		int i = 1;
		//找到第一个后一位小于前一位的位置i（这一步很关键）
		while (i < strN.length && strN[i - 1] <= strN[i]) {
			i += 1;
		}
		//如果该位置有效
		if (i < strN.length) {
			//i之前的每一位都减一
			while (i > 0 && strN[i - 1] > strN[i]) {
				strN[i - 1] -= 1;//所以这里用的是i-1项
				i -= 1;
			}
			//倒着减一之后需要正着补9
			for (i += 1; i < strN.length; ++i) {
				strN[i] = '9';
			}
		}
		return Integer.parseInt(new String(strN));
	}
}
