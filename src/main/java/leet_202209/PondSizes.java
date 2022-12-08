package leet_202209;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

/**
 * 面试题 16.19. 水域大小
 * @Author wanys
 * @Date 2022/9/13 19:10
 * @Version 1.0
 **/
public class PondSizes {
    int[][] visited;//1表示为已经访问过
    int[] dx={-1, 1, 0, 0, -1, -1, 1, 1};
    int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};
    public int[] pondSizes(int[][] land) {
        //初始化
        visited=land;
        List<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i <land.length ; i++) {
            for (int j = 0; j < land[0].length ; j++) {
                if(land[i][j]==0){
                    list.add(dfs(land,i,j));
                }
            }
        }
        //将list转成数组进行排序
        int[] res=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i]= list.get(i);
        }
        Arrays.sort(res);
        return res;
    }
    public int dfs(int[][] land,int x,int y){
        int area=1;
        //标记为已访问
        visited[x][y]=1;
        for(int i=0;i<8;i++){
            int nextX=x+dx[i];
            int nextY=y+dy[i];
            if(nextX>=0&nextY>=0&&nextX< land.length&&nextY< land[0].length&&visited[nextX][nextY]==0){
                area=area+dfs(land, nextX, nextY);
            }
        }


        return area;
    }
}
