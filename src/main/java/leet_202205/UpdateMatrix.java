package leet_202205;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author wanys
 * @Date 2022/5/3 9:13 AM
 * @Version 1.0
 **/
public class UpdateMatrix {

    private int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int[][] updateMatrix(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] ans = new int[rows][cols];//默认填充了0，只需要修改0即可
        //定义一个队列
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[rows][cols];
        //将所有的0加到队列中
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 0) {
                    queue.offer(new int[]{i, j});//放进去的是坐标
                    visited[i][j] = true;
                }
            }
        }
        //添加到队列之后，，进行广度遍历
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();//弹出0的坐标
            int i = poll[0];
            int j = poll[1];
            for (int[] dir : dirs) {
                //计算下一个位置
                int nextX = i + dir[0];
                int nextY = j + dir[1];
                //不在队列里边的位置都是1 ，所以不用判断
                if (nextX >= 0 && nextX < rows && nextY >= 0 && nextY < cols && !visited[nextX][nextY]) {
                    ans[nextX][nextY] = ans[i][j] + 1;
                    queue.offer(new int[]{nextX, nextY});//因为这个是加入到了所有0 的后边肯定是优先从0遍历啊，0遍历完了之后才会从1，2开始遍历
                    visited[nextX][nextY] = true;
                }
            }
        }
        return ans;
    }
}
