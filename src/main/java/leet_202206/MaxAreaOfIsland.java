package leet_202206;

/**
 * 剑指 Offer II 105. 岛屿的最大面积
 * @Author wanys
 * @Date 2022/6/30 4:04 PM
 * @Version 1.0
 **/
public class MaxAreaOfIsland {

    int rows;
    int cols;
    int[][] dirs=new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
    int count=0;
    public int maxAreaOfIsland(int[][] grid) {
        rows=grid.length;
        cols=grid[0].length;
        int result=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                //如果是陆地且没有被访问过，就开始遍历
                if(grid[i][j]==1){
                    //更新count值为1
                    count=1;
                    result= Math.max(result,dfs(grid,i,j));//记录最大值
                }
            }
        }
        return result;
    }
    public int dfs(int[][] grid,int x,int y){
        //先标记为已访问
        grid[x][y]=0;
        //对四个方向进行遍历
        for(int[] dir:dirs){
            int nextX=x+dir[0];
            int nextY=y+dir[1];
            //判断下一个位置的合法性
            if(nextX<0||nextX>=rows||nextY<0||nextY>=cols||grid[nextX][nextY]==0) {
                continue;
            } else{
                count++;
                dfs(grid,nextX,nextY);
            }
        }
        return count;
    }
}
