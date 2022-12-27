package leet_202212;

/**
 * 2478. 完美分割的方案数
 */
public class BeautifulPartitions {
	private static final int MOD = (int) 1e9 + 7;

	public int beautifulPartitions(String s, int k, int minLength) {
		char[] chars = s.toCharArray();
		int n = chars.length;
		if (k * minLength > n || !isPrime(chars[0]) || isPrime(chars[n - 1])) // 剪枝
			return 0;
		int[][] f = new int[k + 1][n + 1];
		f[0][0] = 1;
		for (int i = 1; i <= k; ++i) {
			int sum = 0;
			// 优化：枚举的起点和终点需要给前后的子串预留出足够的长度
			for (int j = i * minLength; j + (k - i) * minLength <= n; j++) {
				if (canPartition(chars, j - minLength)) sum = (sum + f[i - 1][j - minLength]) % MOD; // j'=j-l 双指针
				if (canPartition(chars, j)) f[i][j] = sum;
			}
		}
		return f[k][n];
	}

	private boolean isPrime(char c) {
		return c == '2' || c == '3' || c == '5' || c == '7';
	}

	// 判断是否可以在 j-1 和 j 之间分割（开头和末尾也算）
	private boolean canPartition(char[] s, int j) {
		return j == 0 || j == s.length || !isPrime(s[j - 1]) && isPrime(s[j]);
	}
}
