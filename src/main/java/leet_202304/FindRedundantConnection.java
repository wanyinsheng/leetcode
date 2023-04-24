package leet_202304;

/**
 * 684. 冗余连接
 * @Author wanys
 * @Date 2023/4/24 14:53
 * @Version 1.0
 **/
public class FindRedundantConnection {
    /**
     * 并查集
     * 可以通过并查集寻找附加的边。
     */
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        int[] parent = new int[n + 1];
        for (int i = 1; i <=n ; i++) {
            parent[i] = i;
        }
        for (int i = 0; i <n ; i++) {
            int[] edge=edges[i];
            int node1=edge[0],node2=edge[1];
            //不属于同一个连通分量，合并这两个顶点的联通分量
            if(find(parent, node1) != find(parent, node2)){
                union(parent, node1, node2);
            }else{
                return edge;
            }
        }
        return new int[]{0};
    }

    static void union(int[] parent, int index1, int index2) {
        parent[find(parent, index1)] = find(parent, index2);
    }
    static int find(int[] parent,int index){
        if(parent[index] !=index){
            parent[index] = find(parent, parent[index]);
        }
        return parent[index];
    }
}
