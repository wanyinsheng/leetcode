package leet_202205;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author wanys
 * @Date 2022/5/3 10:32 AM
 * @Version 1.0
 **/
public class ShortestPath {
    /**
     * BFS 因为可以消除障碍物，所以，使用三元组（i,j,res）res表示还可以消除的障碍物个数
     *
     * @param grid
     * @param k
     * @return
     */
    public int shortestPath(int[][] grid, int k) {
        int rows = grid.length;
        int cols = grid[0].length;

        //判断k的一些特殊情况
        if (k > rows + cols - 2)
            return rows + cols - 2;

        int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        boolean[][][] visited = new boolean[rows][cols][k];
        Queue<int[]> queue = new LinkedList<>();
        //入队列，标记为已访问
        queue.offer(new int[]{0, 0});
        visited[0][0][k] = true;

        int ans = 0;


        while (!queue.isEmpty()) {
            ans++;
            for (int size = queue.size(); size > 0; size++) {
                int[] poll = queue.poll();
                int i = poll[0];
                int j = poll[1];
                k = poll[2];
                //开始遍历四个方向
                for (int[] dir : dirs) {
                    int nextX = i + dir[0];
                    int nextY = j + dir[1];

                    //判断下一个位置的合法性
                    if (nextX >= 0 && nextX < rows && nextY >= 0 && nextY < cols) {
                        //是否终点
                        if (nextX == rows - 1 && nextY == cols - 1) {
                            return ans;
                        }
                        //不是终点，就要判断是否为障碍物，是否为非障碍物
                        if (grid[nextX][nextY] == 0 && !visited[nextX][nextY][k]) {//非障碍物
                            queue.offer(new int[]{nextX, nextY, k});
                            visited[nextX][nextY][k] = true;
                        } else if (grid[nextX][nextY] == 1 && k > 0 && visited[nextX][nextY][k - 1]) {
                            queue.offer(new int[]{nextX, nextY, k - 1});
                            visited[nextX][nextY][k - 1] = true;
                        }
                    }
                }
            }
        }
        return -1;
    }
}
