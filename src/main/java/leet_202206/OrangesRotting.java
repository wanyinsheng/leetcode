package leet_202206;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/**
 * 994. 腐烂的橘子
 *
 * @Author wanys
 * @Date 2022/6/2 4:11 PM
 * @Version 1.0
 **/
public class OrangesRotting {
    int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    //多源广搜
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<Integer> queue = new ArrayDeque<>();
        //维护一个深度的数组
        Map<Integer, Integer> depth = new HashMap<Integer, Integer>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    int code = i * cols + j;//每个坐标位置的编码
                    queue.add(code);
                    depth.put(code, 0);
                }
            }
        }
        int ans = 0;//最大深度
        while (!queue.isEmpty()) {
            int code = queue.remove();
            //从编码中获取行列信息
            int row = code / cols;
            int col = code % cols;
            //遍历四个方向
            for (int[] dir : dirs) {
                int nextRow = row + dir[0];
                int nextCol = col + dir[1];
                //判断位置的合法性
                if (nextRow >= 0 && nextRow < rows && col >= 0 && col < cols && grid[nextRow][nextCol] == 1) {
                    grid[nextRow][nextCol] = 2;
                    int nextCode = nextRow * cols + nextCol;
                    queue.add(nextCode);
                    depth.put(nextCode, depth.get(code) + 1);//更新深度
                    ans = depth.get(nextCode);
                }
            }
        }
        for (int[] row : grid) {
            for (int v : row) {
                if (v == 1) {//如果还有新鲜橘子，就不能全部被腐烂
                    return -1;
                }
            }
        }
        return ans;


    }
}
