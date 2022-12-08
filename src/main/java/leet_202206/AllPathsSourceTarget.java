package leet_202206;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @Author wanys
 * @Date 2022/6/30 3:17 PM
 * @Version 1.0
 **/
public class AllPathsSourceTarget {
    ArrayList<List<Integer>> lists = new ArrayList<>();
    Deque<Integer> stack = new ArrayDeque<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        stack.offerLast(0);
        dfs(graph, 0, graph.length - 1);
        return lists;

    }

    public void dfs(int[][] graph,int x,int n){
        if(x==n){
            lists.add(new ArrayList<>(stack));
            return;
        }
        for (int y : graph[x]) {
            stack.offerLast(y);
            dfs(graph, y, n);
            stack.pollLast();
        }
    }
}
