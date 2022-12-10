package leet_202212;

/**
 * 2485. 找出中枢整数
 */
public class PivotInteger {
	public int pivotInteger(int n) {
		int m = n * (n + 1) / 2;
		int x = (int) Math.sqrt(m);
		if (x * x == m)
			return x;
		return -1;

	}
}
