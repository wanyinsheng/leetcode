package leet_202205;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author wanys
 * @Date 2022/5/3 10:28 AM
 * @Version 1.0
 **/
public class NearestExit {
    public int nearestExit(char[][] maze, int[] entrance) {
        int[][] dirs=new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        int rows=maze.length;
        int cols=maze[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int ans=0;
        queue.offer(entrance);//入口进队列
        maze[entrance[0]][entrance[1]]='+';

        while(!queue.isEmpty()){
            ans++;
            for (int size = queue.size(); size >0; size--) {
                int[] poll = queue.poll();
                int i=poll[0];
                int j=poll[1];
                for(int[] dir:dirs){
                    int nextX=i+dir[0];
                    int nextY=j+dir[1];
                    //判断下一个位置的合法性
                    if(nextX>=0&&nextX<rows&&nextY>=0&&nextY<cols&&maze[nextX][nextY]=='.'){
                        //如果是出口，直接返回
                        if(nextX==0||nextX==rows-1||nextY==0||nextY==cols-1)
                            return ans;

                        queue.offer(new int[]{nextX,nextY});
                        maze[nextX][nextY]='+';//标记为已访问

                    }                }
            }
        }
        return -1;

    }
}
