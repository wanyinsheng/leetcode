package leet_202205;

/**
 * @Author wanys
 * @Date 2022/5/3 8:51 AM
 * @Version 1.0
 **/
public class FloodFill {
    private int[][] dirs=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        dfs(image,sr,sc,image[sr][sc],newColor);
        return image;
    }
    public void dfs(int[][] image, int i,int j,int oldCol,int newCOl){
        //边界判断
        if(i<0||i>=image.length||j<0||j>=image[0].length||image[i][j]!=oldCol||image[i][j]==newCOl){
            return;
        }
        image[i][j]=newCOl;//修改为新颜色
        for(int[] dir:dirs){
            dfs(image,i+dir[0],j+dir[1],oldCol,newCOl);
        }
    }
}
