package leet_202204;

/**
 * @Author wanys
 * @Date 2022/4/24 12:55 PM
 * @Version 1.0
 **/
public class MinPathSum {
    public int minPathSum(int[][] grid) {
        //特殊情况考虑
        if(grid==null||grid.length==0||grid[0].length==0)
            return 0;
        int rows=grid.length;
        int cols=grid[0].length;
        //dp数组
        int[][] dp=new int[rows][cols];
        //第一个位置
        dp[0][0]=grid[0][0];
        //先将第一列填充，因为第一列只能向下走
        for (int i = 1; i <rows ; i++) {
            dp[i][0]=dp[i-1][0]+grid[i][0];
        }
        //填充第一行，只能向右移动
        for (int j = 1; j <cols ; j++) {
            dp[0][j]=dp[0][j-1]+grid[0][j];
        }
        for (int i = 1; i <rows ; i++) {
            for (int j = 1; j <cols ; j++) {
                dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        }
        return dp[rows-1][cols-1];
    }
}
