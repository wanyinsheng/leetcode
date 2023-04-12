package OD;

/**
 * @Author wanys
 * @Date 2023/3/21 11:12
 * @Version 1.0
 **/
public class 矩阵扩散 {
    static int m = 1;
    static int n = 1;

    public static void main(String[] args) {

        int[][] array = new int[m][n];
        int result = 0;//记录循环次数
        while (isContainZero(array)) {
            int[][] arrayTemp = new int[m][n];
            for (int a = 0; a < m; ++a) {
                for (int b = 0; b < n; ++b) {
                    if (1 == array[a][b]) {
                        arrayTemp[a][b] = 1;
                        if (0 <= a - 1) {
                            arrayTemp[a - 1][b] = 1;
                        }
                        if (a + 1 < m) {
                            arrayTemp[a + 1][b] = 1;
                        }
                        if (b - 1 >= 0) {
                            arrayTemp[a][b - 1] = 1;
                        }
                        if (b + 1 < n) {
                            arrayTemp[a][b + 1] = 1;
                        }
                    }
                }
            }
            array = arrayTemp;
            //时间加一秒
            result++;
        }
    }

    public static boolean isContainZero(int[][] array) {
        for (int k = 0; k < m; k++) {
            for (int i = 0; i < n; i++) {
                if (array[k][i] == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
