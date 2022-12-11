package leet_202205;

/**
 * 1254. 统计封闭岛屿的数目
 *
 * @Author wanys
 * @Date 2022/5/24 10:03 AM
 * @Version 1.0
 **/
public class ClosedIsland {

    int[][] dirs = new int[][]{{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
    int cols;
    int rows;

    public int closedIsland(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        int ans=0;
        if (rows <= 2 || cols <= 2)
            return 0;
        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                if (grid[i][j] == 0)
                     if(dfs(grid, i, j)) ans++;
            }
        }
        return ans;
    }

    public boolean dfs(int[][] grid, int x, int y) {
        if ((x == 0 || x == rows - 1 || y == 0 || y == cols - 1) && grid[x][y] == 0)
            return false;
        boolean flag = true;
        grid[x][y] = 1;//标记为已经访问
        for (int[] dir : dirs) {
            int nextX = x + dir[0];
            int nextY = y + dir[1];
            //判断下一个位置的合法性
            if (nextX < 0 || nextX >= rows || nextY < 0 || nextY >= cols || grid[nextX][nextY] == 1)
                continue;
            flag = flag & dfs(grid, nextX, nextY);
        }
        return flag;
    }
}
