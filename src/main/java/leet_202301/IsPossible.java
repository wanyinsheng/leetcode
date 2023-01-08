package leet_202301;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author wanys
 * @Date 2023/1/8 10:08
 * @Version 1.0
 **/
public class IsPossible {
    public boolean isPossible(int n, List<List<Integer>> edges) {
        Set<Long> set = new HashSet<>();
        int[] degrees = new int[n];
        for (List<Integer> edge : edges) {
            int u = edge.get(0) - 1, v = edge.get(1) - 1;
            degrees[u]++;
            degrees[v]++;
            set.add(hash(u, v));
        }
        List<Integer> ns = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if ((degrees[i] & 1) == 1) ns.add(i);
        }
        Integer[] nodes = ns.toArray(new Integer[0]);
        if (nodes.length == 0) return true;
        if (nodes.length == 2) {
            if (!set.contains(hash(nodes[0], nodes[1]))) return true; // 添加一条边
            for (int i = 0; i < n; i++) {
                if ((degrees[i] & 1) == 0) { // 添加两条边
                    if (!set.contains(hash(nodes[0], i)) && !set.contains(hash(nodes[1], i))) return true;
                }
            }
        }
        if (nodes.length == 4) // 添加两条边
            return (!set.contains(hash(nodes[0], nodes[1])) && !set.contains(hash(nodes[2], nodes[3]))) ||
                    (!set.contains(hash(nodes[0], nodes[2])) && !set.contains(hash(nodes[1], nodes[3]))) ||
                    (!set.contains(hash(nodes[0], nodes[3])) && !set.contains(hash(nodes[1], nodes[2])));
        return false;
    }

    public long hash(int a, int b) {
        if (a > b) return hash(b, a);
        return a * 100005L + b;
    }

}
