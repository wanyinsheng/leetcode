package leet_202205;

/**
 * 剑指 Offer II 116. 省份数量
 * @Author wanys
 * @Date 2022/5/25 10:31 PM
 * @Version 1.0
 **/
public class FindCircleNum {
    public int findCircleNum(int[][] isConnected) {
        int cities=isConnected.length;
        boolean[] visited=new boolean[cities];
        int provinces=0;
        for (int i = 0; i <cities ; i++) {
            if(!visited[i]){
                dfs(isConnected,visited,cities,i);
                provinces++;
            }
        }
        return provinces;


    }
    public void dfs(int[][] isConnected,boolean[] visited,int cites,int i){
        for (int j = 0; j <cites ; j++) {
            if(isConnected[i][j]==1&&!visited[j]){
                visited[j]=true;
                dfs(isConnected,visited,cites,j);
            }
        }
    }
}
