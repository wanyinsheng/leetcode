package leet_202205;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author wanys
 * @Date 2022/5/3 9:53 AM
 * @Version 1.0
 **/
public class ShortestPathBinaryMatrix {



    /**
     * 因为是找最短距离，所以使用BFS
     *
     * @param grid
     * @return
     */
    public int shortestPathBinaryMatrix(int[][] grid) {

        int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {-1, 1}, {1, 1}, {1, -1}};
        //检查开始点
        if (grid[0][0] != 0)
            return -1;

        Queue<int[]> queue = new LinkedList<>();
        int ans = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        //根节点入队列
        queue.offer(new int[]{0, 0});
        grid[0][0] = 1;//标记为已经访问
        //BFS
        while (!queue.isEmpty()) {
            ans++;
            for (int size = queue.size(); size > 0; size--) {

                int[] poll = queue.poll();
                int i = poll[0];
                int j = poll[1];
                //判断是不是已经遍历到终点了
                if (i == rows - 1 && j == cols - 1) {
                    return ans;
                }
                //遍历八个方向
                for (int[] dir : dirs) {
                    int nextX = i + dir[0];
                    int nextY = j + dir[1];
                    //判断下一个位置的合法性
                    if (nextX >= 0 && nextX < rows && nextY >= 0 && nextY < cols && grid[nextX][nextY] == 0) {
                        queue.offer(new int[]{nextX, nextY});
                        grid[nextX][nextY] = 1;//标记下一个位置为已访问
                    }
                }


            }
        }
        return -1;
    }
}
