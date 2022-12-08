package leet_202204;

/**
 * 1706. 球会落何处
 * @Author wanys
 * @Date 2022/4/1 4:37 PM
 * @Version 1.0
 **/
public class FindBall {
    public int[] findBall(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        int[] res=new int[cols];
        for (int ball = 0; ball <cols ; ball++) {//一次解决一个小球
            int col=ball;//球的初试列
            for (int[] rowArr:grid){
                int direction=rowArr[col];//获取方向
                col+=direction;//在第i行移动
                if(col<0||col==cols||rowArr[col]!=direction){//下一步的方向和当前方向不一致
                    col=-1;//v字形或者没有下去
                    break;
                }
            }
            res[ball]=col;
            
            
        }
        return res;
    }
}
