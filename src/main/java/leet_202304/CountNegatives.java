package leet_202304;

/**
 * @Author wanys
 * @Date 2023/4/24 10:45
 * @Version 1.0
 **/
public class CountNegatives {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        for (int i = 0, j = cols - 1; i < rows && j >= 0; ) {//从右上角往左下角遍历
            if (grid[i][j] >= 0) {
                i++;//换到下一行
            } else {
                count += rows - i;//按列统计
                j--;
            }
        }
        return count;
    }
}
