package leet_202208;

import java.util.*;

/**
 * @Author wanys
 * @Date 2022/8/2 15:19
 * @Version 1.0
 **/
public class RestoreArray {
    public int[] restoreArray(int[][] adjacentPairs) {
        //key元素，value是key相邻元素
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        for (int[] adjacentPair : adjacentPairs) {
            map.putIfAbsent(adjacentPair[0], new ArrayList<Integer>());
            map.putIfAbsent(adjacentPair[1], new ArrayList<Integer>());
            map.get(adjacentPair[0]).add(adjacentPair[1]);
            map.get(adjacentPair[1]).add(adjacentPair[0]);
        }
        int n = adjacentPairs.length + 1;
        int[] ret = new int[n];

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            int key = entry.getKey();
            List<Integer> value = entry.getValue();
            if (value.size() == 1) {
                ret[0] = key;
                break;
            }

        }
        ret[1] = map.get(ret[0]).get(0);
        for (int i = 2; i < n; i++) {
            List<Integer> adj = map.get(ret[i - 1]);
            ret[i] = ret[i - 2] == adj.get(0) ? adj.get(1) : adj.get(0);
        }
        return ret;

    }

}
