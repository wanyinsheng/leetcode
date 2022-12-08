package leet_202205;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author wanys
 * @Date 2022/5/3 9:34 AM
 * @Version 1.0
 **/
public class HighestPeak {
    private int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int[][] highestPeak(int[][] isWater) {
        Queue<int[]> queue = new LinkedList<>();
        int rows = isWater.length;
        int cols = isWater[0].length;


        int[][] ans = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            Arrays.fill(ans[i], -1);//表示该格子尚未访问过
        }
        //将所有的水域加入队列
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (isWater[i][j] == 1) {
                    ans[i][j] = 0;//水域的高度为0
                    queue.offer(new int[]{i, j});
                }
            }
        }
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int i = poll[0];
            int j = poll[1];
            for (int[] dir : dirs) {
                int nextX = i + dir[0];
                int nextY = j + dir[1];
                //判断下一个位置的合法性
                if (nextX >= 0 && nextX < rows && nextY >= 0 && nextY < cols && ans[nextX][nextY] == -1) {
                    ans[nextX][nextY] = ans[i][j] + 1;//当前位置加一，即可，因为BFS优先遍历的是0，1，，2.。。。
                    queue.offer(new int[]{nextX, nextY});
                }
            }
        }
        return ans;

    }
}
