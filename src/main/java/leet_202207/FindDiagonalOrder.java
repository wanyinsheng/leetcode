package leet_202207;

/**
 * 498. 对角线遍历
 * @Author wanys
 * @Date 2022/7/1 11:24 AM
 * @Version 1.0
 **/
public class FindDiagonalOrder {

    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m * n];
        int pos = 0;
        for (int i = 0; i < m + n - 1; i++) {
            if (i % 2 == 1) {//从  右上  到   左下
                int x = i < n ? 0 : i - n + 1;//行
                int y = i < n ? i : n - 1;//列
                while (x < m && y >= 0) {
                    res[pos] = mat[x][y];
                    pos++;
                    x++;
                    y--;
                }
            } else {// 从  左下  到 右上
                int x = i < m ? i : m - 1;//行
                int y = i < m ? 0 : i - m + 1;//列
                while (x >= 0 && y < n) {
                    res[pos] = mat[x][y];
                    pos++;
                    x--;
                    y++;
                }
            }
        }
        return res;
    }
}
