package leet_202210;

/**
 * @Author wanys
 * @Date 2022/10/17 10:38
 * @Version 1.0
 **/
public class MaxValue {
    /**
     * 动态规划
     * @param grid
     * @return
     */
    public int maxValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if(i == 0 && j == 0) continue;//跳过第一个位置，防止下边grid[i][j - 1]越界
                if(i == 0) grid[i][j] += grid[i][j - 1] ;
                else if(j == 0) grid[i][j] += grid[i - 1][j];
                else grid[i][j] += Math.max(grid[i][j - 1], grid[i - 1][j]);


            }

        }
        return grid[m - 1][n - 1];
    }
}
