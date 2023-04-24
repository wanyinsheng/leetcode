package leet_202304;

/**
 * 685. 冗余连接 II
 *
 * @Author wanys
 * @Date 2023/4/24 15:03
 * @Version 1.0
 **/
public class FindRedundantDirectedConnection {
    /**
     * 若有多个答案，返回最后出现在给定二维数组的答案。
     * <p>
     * 并查集
     */
    public int[] findRedundantDirectedConnection(int[][] edges) {
        int n = edges.length;
        UnionFind unionFind = new UnionFind(n + 1);
        int[] parent = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }
        int conflict = -1;
        int cycle = -1;
        for (int i = 0; i < n; i++) {//遍历每一条边
            int[] edge = edges[i];
            int node1 = edge[0], node2 = edge[1];
            if (parent[node2] != node2) {
                conflict = i;
            } else {
                parent[node2] = node1;
                if (unionFind.find(node1) == unionFind.find(node2)) {
                    cycle = i;
                } else {
                    unionFind.union(node1, node2);
                }
            }

        }
        //
        if (conflict < 0) {
            int[] redundant = {edges[cycle][0], edges[cycle][1]};
            return redundant;
        } else {
            int[] conflictEdge = edges[conflict];
            if (cycle >= 0) {
                int[] redundant = {parent[conflictEdge[1]], conflictEdge[1]};
                return redundant;
            } else {
                int[] redundant = {conflictEdge[0], conflictEdge[1]};
                return redundant;
            }
        }

    }

    class UnionFind {
        int[] ancestor;//祖先数组   从0开始

        public UnionFind(int n) {
            ancestor = new int[n];
            for (int i = 0; i < n; ++i) {
                ancestor[i] = i;
            }
        }

        public void union(int index1, int index2) {
            ancestor[find(index1)] = find(index2);
        }

        public int find(int index) {
            if (ancestor[index] != index) {
                ancestor[index] = find(ancestor[index]);
            }
            return ancestor[index];
        }
    }
}
