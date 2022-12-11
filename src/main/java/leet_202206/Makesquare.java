package leet_202206;

import java.util.Arrays;

/**
 * 473. 火柴拼正方形
 * @Author wanys
 * @Date 2022/6/2 1:34 PM
 * @Version 1.0
 **/
public class Makesquare {

    public boolean makesquare(int[] matchsticks) {
        int len = Arrays.stream(matchsticks).sum();
        //考虑总长度
        if(len%4!=0){
            return false;
        }
        Arrays.sort(matchsticks);//默认是升序
        //四条边的总长度数组
        int[] edges = new int[4];
        //从大到小排序
        for (int i = 0, j = matchsticks.length - 1; i < j; i++, j--) {
            int temp = matchsticks[i];
            matchsticks[i] = matchsticks[j];
            matchsticks[j] = temp;
        }


        return dfs(0, matchsticks, edges, len / 4);



    }
    public boolean dfs(int index,int[] matchsticks,int[] edges,int len){
        if(index==matchsticks.length)
            return  true;

        for (int i = 0; i < edges.length; i++) {
            edges[i]+=matchsticks[index];
            if (edges[i] <= len && dfs(index + 1, matchsticks, edges, len)) {
                return true;
            }
            edges[i] -= matchsticks[index];
        }
        return false;
    }
}
