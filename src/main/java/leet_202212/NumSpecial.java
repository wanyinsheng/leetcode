package leet_202212;

/**
 * 1582. 二进制矩阵中的特殊位置
 */
public class NumSpecial {
	public int numSpecial(int[][] mat) {
		int m = mat.length, n = mat[0].length;
		//利用求和的思想去做
		int[] rowsSum = new int[m];
		int[] colsSum = new int[n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				rowsSum[i] += mat[i][j];
				colsSum[j] += mat[i][j];
			}
		}
		int res = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] == 1 && rowsSum[i] == 1 && colsSum[j] == 1) {
					res++;
				}
			}
		}
		return res;
	}


}
