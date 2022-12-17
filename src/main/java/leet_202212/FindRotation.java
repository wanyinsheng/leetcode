package leet_202212;

/**
 * 1886. 判断矩阵经轮转后是否一致
 */
public class FindRotation {
	/**
	 * 最多旋转三次
	 * @param mat
	 * @param target
	 * @return
	 */
	public boolean findRotation(int[][] mat, int[][] target) {
		int n = mat.length;
		for (int count = 0; count < 4; ++count) {
			for (int i = 0; i < n / 2; ++i) {
				for (int j = 0; j < (n + 1) / 2; ++j) {
					int temp = mat[i][j];
					mat[i][j] = mat[n - 1 - j][i];
					mat[n - 1 - j][i] = mat[n - 1 - i][n - 1 - j];
					mat[n - 1 - i][n - 1 - j] = mat[j][n - 1 - i];
					mat[j][n - 1 - i] = temp;
				}
			}
			if (isequals(mat, target)) {
				return true;
			}
		}
		return false;
	}

	public boolean isequals(int[][] mat, int[][] target) {
		for (int i = 0; i < mat.length; ++i) {
			for (int j = 0; j < mat[0].length; ++j) {
				if (mat[i][j] != target[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
