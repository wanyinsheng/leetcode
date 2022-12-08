package leet_202203;

/**
 * 1020. 飞地的数量
 * @Author wanys
 * @Date 2022/3/29 5:57 PM
 * @Version 1.0
 **/
public class NumEnclaves {
    public static int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private int m, n;
    private boolean[][] visited;

    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        visited=new boolean[m][n];
        //可以先将四周标记为访问，即，因为肯定不是飞地
        for (int i = 0; i <m ; i++) {
            dfs(grid,i,0);//第一列
            dfs(grid,i,n-1);//最后一列
            
        }
        for (int i = 1; i <n-1 ; i++) {
            dfs(grid,0,i);//第一行
            dfs(grid,m-1,i);//最后一行
        }
        //从四周遍历完之后剩下的就是飞地的个数，直接去遍历即可
        int sum=0;//飞地的数量
        //这里即统计中间区域
        for (int i = 1; i < m-1; i++) {
            for (int j = 1; j <n-1 ; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    sum++;
                }
            }
        }
        return  sum;
    }
    public void dfs(int[][] grid, int row, int col) {
        //考虑边界情况，为水域或者已经被访问过
        if(row<0||row>=m||col<0||col>=n||grid[row][col]==0||visited[row][col]){
            return;
        }
        //标记为已经访问
        visited[row][col]=true;
        //向四个方向移动
        for(int[] dir:dirs){
            dfs(grid,row+dir[0],col+dir[1]);
        }
    }

}
